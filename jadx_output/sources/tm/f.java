package tm;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f420425a = null;

    /* renamed from: b, reason: collision with root package name */
    public long f420426b = 0;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f420427c = null;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f420428d = new java.util.HashMap();

    public java.lang.String toString() {
        java.util.Iterator it = ((java.util.HashMap) this.f420428d).keySet().iterator();
        java.lang.String str = "";
        while (it.hasNext()) {
            str = str + ((java.lang.Integer) it.next()) + ",";
        }
        if (str.length() > 0) {
            str = str.substring(0, str.length() - 1);
        }
        return java.lang.String.format("NoticeInfo(%d){noticeID[%s], disasterTick[%d], content[%s], posistions[%s]}", java.lang.Integer.valueOf(hashCode()), this.f420425a, java.lang.Long.valueOf(this.f420426b), this.f420427c, str);
    }
}
