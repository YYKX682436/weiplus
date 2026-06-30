package com.tencent.mm.voipmp.support.history;

/* loaded from: classes8.dex */
public final class j extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f213773d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.view.recyclerview.WxLinearLayoutManager f213774e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f213775f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f213773d = jz5.h.b(new com.tencent.mm.voipmp.support.history.i(this));
        this.f213774e = new com.tencent.mm.view.recyclerview.WxLinearLayoutManager(activity, 1, false);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        jz5.g gVar = this.f213773d;
        java.lang.Object value = ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        ((com.tencent.mm.view.recyclerview.WxRecyclerView) value).setLayoutManager(this.f213774e);
        java.lang.Object value2 = ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.f(value2, "getValue(...)");
        ((com.tencent.mm.view.recyclerview.WxRecyclerView) value2).N(new com.tencent.mm.voipmp.support.history.h(getActivity()));
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f213775f;
        if (wxRecyclerAdapter != null) {
            java.util.List data = wxRecyclerAdapter.getData();
            if (data != null) {
                data.clear();
            }
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = this.f213775f;
            if (wxRecyclerAdapter2 != null) {
                wxRecyclerAdapter2.notifyDataSetChanged();
                return;
            }
            return;
        }
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        final com.tencent.mm.voipmp.support.history.g gVar2 = (com.tencent.mm.voipmp.support.history.g) pf5.z.f353948a.a(activity).a(com.tencent.mm.voipmp.support.history.g.class);
        gVar2.getClass();
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter3 = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.voipmp.support.history.VoIPHistoryData$initVoIPTalkerInfoListAdapter$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                com.tencent.mars.xlog.Log.i("MicroMsg.VoIPHistoryData", "getItemConvert, type:" + type);
                return new com.tencent.mm.voipmp.support.history.c(new com.tencent.mm.voipmp.support.history.d(com.tencent.mm.voipmp.support.history.g.this));
            }
        }, gVar2.f213766d, true);
        gVar2.f213767e = wxRecyclerAdapter3;
        wxRecyclerAdapter3.setHasStableIds(true);
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter4 = gVar2.f213767e;
        if (wxRecyclerAdapter4 != null) {
            wxRecyclerAdapter4.f293105o = new com.tencent.mm.voipmp.support.history.e(gVar2);
        }
        java.lang.Object value3 = ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.f(value3, "getValue(...)");
        ((com.tencent.mm.view.recyclerview.WxRecyclerView) value3).setAdapter(wxRecyclerAdapter4);
        this.f213775f = wxRecyclerAdapter4;
    }
}
