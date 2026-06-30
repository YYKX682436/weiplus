package com.tencent.mm.plugin.ringtone.uic;

/* loaded from: classes10.dex */
public final class d1 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f158382d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f158383e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.recyclerview.widget.LinearLayoutManager f158384f;

    /* renamed from: g, reason: collision with root package name */
    public in5.w f158385g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f158382d = jz5.h.b(new com.tencent.mm.plugin.ringtone.uic.a1(this));
    }

    public final com.tencent.mm.view.recyclerview.WxRecyclerView O6() {
        java.lang.Object value = ((jz5.n) this.f158382d).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.view.recyclerview.WxRecyclerView) value;
    }

    public final void P6() {
        android.view.View view;
        android.view.View view2;
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        java.lang.Object a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.ringtone.uic.v.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        android.view.View view3 = null;
        this.f158383e = ed0.r0.n6((ed0.r0) a17, false, 1, null);
        O6().setAdapter(this.f158383e);
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.cgw, (android.view.ViewGroup) O6(), false);
        if (inflate != null) {
            inflate.setLayoutParams(new androidx.recyclerview.widget.RecyclerView.LayoutParams(-1, -2));
            inflate.getLayoutParams().height = com.tencent.mm.ui.zk.a(inflate.getContext(), 84);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) inflate.findViewById(com.tencent.mm.R.id.dgo);
        if (com.tencent.mm.ui.bk.C()) {
            weImageView.setImageDrawable(com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.icon_filled_endline_night, getContext().getResources().getColor(com.tencent.mm.R.color.FG_4)));
        } else {
            weImageView.setImageDrawable(com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.icon_filled_endline, getContext().getResources().getColor(com.tencent.mm.R.color.FG_4)));
        }
        weImageView.setVisibility(8);
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f158383e;
        in5.w O = wxRecyclerAdapter != null ? wxRecyclerAdapter.O(inflate, 0, false) : null;
        this.f158385g = O;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (O == null || (view2 = ((in5.a0) O).f293003d) == null) ? null : (com.tencent.mm.ui.widget.imageview.WeImageView) view2.findViewById(com.tencent.mm.R.id.dgo);
        if (weImageView2 != null) {
            weImageView2.setVisibility(8);
        }
        in5.w wVar = this.f158385g;
        if (wVar != null && (view = ((in5.a0) wVar).f293003d) != null) {
            view3 = view.findViewById(com.tencent.mm.R.id.im8);
        }
        if (view3 == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        android.view.View view4 = view3;
        yj0.a.d(view4, arrayList.toArray(), "com/tencent/mm/plugin/ringtone/uic/RingtoneFinderAuthorMainUIC", "showLoadingMore", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/ringtone/uic/RingtoneFinderAuthorMainUIC", "showLoadingMore", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i18 == 6) {
            getActivity().setResult(6, getIntent());
            getActivity().finish();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        O6().setItemAnimator(null);
        O6().i(new com.tencent.mm.plugin.ringtone.uic.b1(this));
        this.f158384f = new androidx.recyclerview.widget.LinearLayoutManager(getActivity());
        O6().setLayoutManager(this.f158384f);
        com.tencent.mm.view.recyclerview.WxRecyclerView O6 = O6();
        com.tencent.mm.plugin.ringtone.uic.c1 c1Var = new com.tencent.mm.plugin.ringtone.uic.c1();
        c1Var.e(1, 10);
        O6.setRecycledViewPool(c1Var);
        kotlinx.coroutines.l.d(getMainScope(), null, null, new com.tencent.mm.plugin.ringtone.uic.z0(this, null), 3, null);
        P6();
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((com.tencent.mm.plugin.ringtone.uic.c3) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.ringtone.uic.c3.class)).f158374f = 1;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        java.util.List data;
        super.onPause();
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f158383e;
        if (wxRecyclerAdapter == null || (data = wxRecyclerAdapter.getData()) == null) {
            return;
        }
        java.util.Iterator it = data.iterator();
        while (it.hasNext()) {
            ((ox3.g) ((ox3.f) it.next())).f349750e = false;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f158383e;
        if (wxRecyclerAdapter != null) {
            wxRecyclerAdapter.notifyDataSetChanged();
        }
    }
}
