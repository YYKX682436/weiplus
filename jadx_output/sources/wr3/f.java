package wr3;

/* loaded from: classes11.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f448776d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.list.BaseBizProfileFragment f448777e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(java.lang.String str, com.tencent.mm.plugin.profile.ui.tab.list.BaseBizProfileFragment baseBizProfileFragment) {
        super(1);
        this.f448776d = str;
        this.f448777e = baseBizProfileFragment;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        vr3.d0 it = (vr3.d0) obj;
        kotlin.jvm.internal.o.g(it, "it");
        android.content.Intent intent = new android.content.Intent();
        tr3.b bVar = new tr3.b();
        bVar.f421430a = 2001;
        bVar.f421431b = false;
        tr3.a.f421426a.a(bVar);
        com.tencent.mars.xlog.Log.i(this.f448776d, "user click topic item");
        intent.putExtra("rawUrl", it.f439626d.f387475f);
        intent.putExtra("geta8key_scene", 3);
        intent.putExtra("key_enable_fts_quick", true);
        j45.l.j(this.f448777e.getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
        return jz5.f0.f302826a;
    }
}
