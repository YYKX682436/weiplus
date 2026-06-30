package ge4;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedList f270988a = new java.util.LinkedList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f270989b = new java.util.LinkedList();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.LinkedList f270990c = new java.util.LinkedList();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f270991d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f270992e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f270993f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f270994g = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f270995h = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c.plus(kotlinx.coroutines.t3.a(null, 1, null)));

    /* renamed from: i, reason: collision with root package name */
    public boolean f270996i;

    /* renamed from: j, reason: collision with root package name */
    public yz5.l f270997j;

    /* renamed from: k, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f270998k;

    /* renamed from: l, reason: collision with root package name */
    public final kotlinx.coroutines.flow.f3 f270999l;

    public e() {
        kotlinx.coroutines.flow.j2 a17 = kotlinx.coroutines.flow.i3.a(new jz5.l(-1, new android.os.Bundle()));
        this.f270998k = a17;
        this.f270999l = kotlinx.coroutines.flow.l.b(a17);
    }

    public final void a(jz5.l lVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emitEvent", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr");
        kotlinx.coroutines.l.d(this.f270995h, null, null, new ge4.b(this, lVar, null), 3, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emitEvent", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr");
    }

    public final java.util.ArrayList b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getErrorMediaIds", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = this.f270993f.iterator();
        while (it.hasNext()) {
            java.lang.String h17 = ((ge4.a) it.next()).b().h();
            kotlin.jvm.internal.o.d(h17);
            arrayList.add(h17);
        }
        java.util.Iterator it6 = this.f270992e.iterator();
        while (it6.hasNext()) {
            java.lang.String h18 = ((ge4.a) it6.next()).b().h();
            kotlin.jvm.internal.o.d(h18);
            arrayList.add(h18);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getErrorMediaIds", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr");
        return arrayList;
    }
}
