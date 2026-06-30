package dz4;

@j95.b
/* loaded from: classes8.dex */
public final class s1 extends i95.w implements ih0.r {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f245396d = "MicroMsg.WeNoteFlutterFeatureService";

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f245397e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Set f245398f = new java.util.LinkedHashSet();

    public void Ai(ih0.p holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        java.util.List list = this.f245397e;
        if (((java.util.ArrayList) list).contains(holder)) {
            ((java.util.ArrayList) list).remove(holder);
            return;
        }
        com.tencent.mars.xlog.Log.w(this.f245396d, "unRegisterFavNoteActivityHolder: holder not found in list, holder key: " + ((ez4.u) holder).f257943b);
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountInitialized(context);
        com.tencent.mars.xlog.Log.i(this.f245396d, "onAccountInitialized: ");
        com.tencent.wechat.aff.favorites.t.f216861a = u72.a.class;
        com.tencent.wechat.aff.wenote.n.f217711a = dz4.p1.f245369a;
        com.tencent.wechat.aff.wcrte.f.f217653a = dz4.q1.f245377a;
        com.tencent.wechat.aff.wenote.o.f217712a = dz4.r1.f245388a;
    }

    public ih0.p wi(java.lang.String key) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(key, "key");
        java.util.Iterator it = this.f245397e.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.o.b(((ez4.u) ((ih0.p) obj)).f257943b, key)) {
                break;
            }
        }
        return (ih0.p) obj;
    }
}
