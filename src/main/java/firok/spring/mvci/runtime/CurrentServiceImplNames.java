package firok.spring.mvci.runtime;

/**
 * @since 17.2.0
 */
@SuppressWarnings("all")
public final class CurrentServiceImplNames
{
	private CurrentServiceImplNames() throws InstantiationException { throw new InstantiationException("不允许初始化"); }



	/**
	 * <p>当前项目中由 MVCI 生成的所有实体类 Service Impl 完整限定名</p>
	 * <p>An array contains full qualified names of all service-impl-class generated by MVCI</p>
	 *
	 * @implNote 此字段会在编译期填充内容 this field will be filled during compiling phase
	 */
	public static final String[] NAMES = new String[] {};



	/**
	 * <p>从类完整限定名获取对应 Service Impl 的完整限定名</p>
	 * <p>To get full qualified name of service-impl-class by full qualified name of bean-class</p>
	 *
	 * @param fullQualifiedBeanName 类完整限定名
	 * @return Service Impl 完整限定名
	 * @implNote 此方法会在编译期填充内容 this method will be filled during compiling phase
	 */
	public static String getByFullQualifiedBeanName(String fullQualifiedBeanName)
	{
		return switch (fullQualifiedBeanName)
		{
			default -> null;
		};
	}
}
