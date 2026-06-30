package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class c0 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f151066d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f151067e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f151068f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.mv.ui.uic.MusicMvAlbumPreviewSelectedUIC$MvPreviewLiveList f151069g;

    /* renamed from: h, reason: collision with root package name */
    public xm3.t0 f151070h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f151066d = jz5.h.b(new com.tencent.mm.plugin.mv.ui.uic.b0(activity));
        this.f151067e = jz5.h.b(new com.tencent.mm.plugin.mv.ui.uic.t(activity));
        this.f151068f = jz5.h.b(new com.tencent.mm.plugin.mv.ui.uic.s(activity));
    }

    public static final com.tencent.mm.view.recyclerview.WxRecyclerView O6(com.tencent.mm.plugin.mv.ui.uic.c0 c0Var) {
        return (com.tencent.mm.view.recyclerview.WxRecyclerView) ((jz5.n) c0Var.f151066d).getValue();
    }

    public final android.widget.Button P6() {
        return (android.widget.Button) ((jz5.n) this.f151067e).getValue();
    }

    public final void Q6(int i17) {
        com.tencent.mm.plugin.mv.ui.uic.MusicMvAlbumPreviewSelectedUIC$MvPreviewLiveList musicMvAlbumPreviewSelectedUIC$MvPreviewLiveList = this.f151069g;
        if (musicMvAlbumPreviewSelectedUIC$MvPreviewLiveList != null) {
            android.content.Intent intent = new android.content.Intent();
            r45.oc5 oc5Var = new r45.oc5();
            for (im3.j jVar : musicMvAlbumPreviewSelectedUIC$MvPreviewLiveList.f152065o) {
                java.util.LinkedList linkedList = oc5Var.f382150e;
                r45.ny5 ny5Var = new r45.ny5();
                ny5Var.f381766e = jVar.f292701g;
                ny5Var.f381765d = jVar.f292700f;
                linkedList.add(ny5Var);
            }
            intent.putExtra("PreviewItemObjCallbackAction", i17);
            intent.putExtra("PreviewItemObjCallback", oc5Var.toByteArray());
            getActivity().setResult(-1, intent);
            getActivity().finish();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.mv.ui.uic.b.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        com.tencent.mm.plugin.mv.ui.uic.b bVar = (com.tencent.mm.plugin.mv.ui.uic.b) a17;
        bVar.O6().m3(getActivity(), new com.tencent.mm.plugin.mv.ui.uic.w(this, bVar));
        bVar.O6().m3(getActivity(), new com.tencent.mm.plugin.mv.ui.uic.z(this));
        P6().setOnClickListener(new com.tencent.mm.plugin.mv.ui.uic.a0(this));
    }
}
