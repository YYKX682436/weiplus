package jz0;

/* loaded from: classes5.dex */
public final class e implements com.tencent.mm.ui.tools.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jz0.k f302570a;

    public e(jz0.k kVar) {
        this.f302570a = kVar;
    }

    @Override // com.tencent.mm.ui.tools.n4
    public void a() {
    }

    @Override // com.tencent.mm.ui.tools.n4
    public void onAnimationEnd() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Maas.FakeVideoAniUIC", "ani end");
        jz0.k kVar = this.f302570a;
        kVar.f302594r = true;
        androidx.appcompat.app.AppCompatActivity activity = kVar.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f353948a;
        if (((com.tencent.mm.mj_template.sns.backgroundwork.ui.MaasFakeVideoPlayUIC) zVar.a(activity).a(com.tencent.mm.mj_template.sns.backgroundwork.ui.MaasFakeVideoPlayUIC.class)).f69827p) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Maas.FakeVideoAniUIC", "ani end but video is finish first frame");
            androidx.appcompat.app.AppCompatActivity activity2 = kVar.getActivity();
            kotlin.jvm.internal.o.g(activity2, "activity");
            com.tencent.mm.mj_template.sns.backgroundwork.ui.MaasFakeVideoPlayUIC maasFakeVideoPlayUIC = (com.tencent.mm.mj_template.sns.backgroundwork.ui.MaasFakeVideoPlayUIC) zVar.a(activity2).a(com.tencent.mm.mj_template.sns.backgroundwork.ui.MaasFakeVideoPlayUIC.class);
            com.tencent.mars.xlog.Log.i(maasFakeVideoPlayUIC.f69818d, "resume play");
            kotlinx.coroutines.l.d(maasFakeVideoPlayUIC.f69820f, null, null, new jz0.y(maasFakeVideoPlayUIC, null), 3, null);
            java.lang.Object value = ((jz5.n) kVar.f302586g).getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            ((android.widget.ImageView) value).setVisibility(8);
        }
    }

    @Override // com.tencent.mm.ui.tools.n4
    public void onAnimationStart() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Maas.FakeVideoAniUIC", "ani start");
        androidx.appcompat.app.AppCompatActivity activity = this.f302570a.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.mj_template.sns.backgroundwork.ui.MaasFakeVideoPlayUIC.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        com.tencent.mm.mj_template.sns.backgroundwork.ui.MaasFakeVideoPlayUIC.Q6((com.tencent.mm.mj_template.sns.backgroundwork.ui.MaasFakeVideoPlayUIC) a17, null, null, false, null, 15, null);
    }
}
