package h71;

/* loaded from: classes15.dex */
public class r implements java.util.Comparator {
    public r(com.tencent.mm.plugin.account.security.ui.MySafeDeviceListUI mySafeDeviceListUI) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        long j17 = ((e71.h) obj).field_createtime;
        long j18 = ((e71.h) obj2).field_createtime;
        if (j17 - j18 > 0) {
            return -1;
        }
        return j17 == j18 ? 0 : 1;
    }
}
