package m51;

/* loaded from: classes12.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f323528a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f323529b;

    /* renamed from: c, reason: collision with root package name */
    public final long f323530c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f323531d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f323532e;

    /* renamed from: f, reason: collision with root package name */
    public final long f323533f;

    /* renamed from: g, reason: collision with root package name */
    public final long f323534g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f323535h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f323536i;

    public e(java.util.List list, java.util.List list2, long j17, java.util.List list3, java.lang.String str, long j18, long j19, long j27, java.util.List list4, java.util.List list5) {
        this.f323535h = new java.util.ArrayList();
        this.f323536i = new java.util.ArrayList();
        this.f323528a = list;
        this.f323530c = j17;
        this.f323529b = list2;
        this.f323531d = list3;
        this.f323532e = str;
        this.f323533f = j18;
        this.f323534g = j19;
        this.f323535h = list4;
        this.f323536i = list5;
    }

    public void a() {
        try {
            java.util.List list = this.f323528a;
            if (list != null) {
                list.clear();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.stubs.logger.Log.i("PatchApplyPlan", "oldFileUncompressionPlan, e = " + e17);
        }
        try {
            java.util.List list2 = this.f323529b;
            if (list2 != null) {
                list2.clear();
            }
        } catch (java.lang.Exception e18) {
            com.tencent.stubs.logger.Log.i("PatchApplyPlan", "deltaFriendlyNewFileRecompressionPlan, e = " + e18);
        }
        try {
            java.util.List list3 = this.f323531d;
            if (list3 != null) {
                list3.clear();
            }
        } catch (java.lang.Exception e19) {
            com.tencent.stubs.logger.Log.i("PatchApplyPlan", "deltaDescriptors, e = " + e19);
        }
        try {
            java.util.List list4 = this.f323535h;
            if (list4 != null) {
                list4.clear();
            }
        } catch (java.lang.Exception e27) {
            com.tencent.stubs.logger.Log.i("PatchApplyPlan", "newSameToUnCompass, e = " + e27);
        }
    }
}
