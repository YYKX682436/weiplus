package ut5;

/* loaded from: classes13.dex */
public abstract class e {
    private static final java.lang.String WHITE_LIST_CLASS_NAME = "com.tencent.shadow.dynamic.impl.WhiteList";
    private static final java.lang.String WHITE_LIST_FIELD_NAME = "sWhiteList";

    public abstract java.lang.String[] getCustomWhiteList();

    public java.lang.String[] loadWhiteList(com.tencent.shadow.core.common.InstalledApk installedApk) {
        return loadWhiteList(installedApk, WHITE_LIST_CLASS_NAME, WHITE_LIST_FIELD_NAME);
    }

    public java.lang.String[] loadWhiteList(com.tencent.shadow.core.common.InstalledApk installedApk, java.lang.String str, java.lang.String str2) {
        java.lang.String[] strArr = null;
        try {
            strArr = (java.lang.String[]) ut5.d.a(installedApk, getClass().getClassLoader()).loadClass(str).getDeclaredField(str2).get(null);
        } catch (java.lang.ClassNotFoundException unused) {
        } catch (java.lang.IllegalAccessException e17) {
            throw new java.lang.RuntimeException(e17);
        } catch (java.lang.NoSuchFieldException e18) {
            throw new java.lang.RuntimeException(e18);
        }
        if (strArr != null) {
            java.lang.String[] customWhiteList = getCustomWhiteList();
            int length = customWhiteList.length;
            int length2 = strArr.length;
            java.lang.String[] strArr2 = new java.lang.String[length + length2];
            java.lang.System.arraycopy(customWhiteList, 0, strArr2, 0, length);
            java.lang.System.arraycopy(strArr, 0, strArr2, length, length2);
            return strArr2;
        }
        return getCustomWhiteList();
    }
}
