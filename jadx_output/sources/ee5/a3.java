package ee5;

/* loaded from: classes3.dex */
public final class a3 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f251815d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f251816e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f251817f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f251818g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f251819h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f251820i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f251815d = jz5.h.b(new ee5.z2(this));
        this.f251816e = jz5.h.b(new ee5.w2(this));
        this.f251817f = "";
        this.f251819h = new java.util.ArrayList();
    }

    public final boolean O6() {
        return j62.e.g().c(new com.tencent.mm.repairer.config.msg_history_gallery.RepairerConfigMsgHistoryGalleryEnabled()) == 1;
    }

    public final void P6(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiSearchEduUIC", "setEduLayoutVisible >> " + i17);
        java.lang.Object value = ((jz5.n) this.f251815d).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        android.view.View view = (android.view.View) value;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiSearchEduUIC", "setEduLayoutVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiSearchEduUIC", "setEduLayoutVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String stringExtra = getIntent().getStringExtra("detail_username");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f251817f = stringExtra;
        this.f251818g = getIntent().getBooleanExtra("detail_user_dismiss", false);
        this.f251820i = j62.e.g().l("clicfg_android_enable_emoji_vertical_search_and_full_search", false, true, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiSearchEduUIC", "initData: " + this.f251817f);
        boolean R4 = com.tencent.mm.storage.z3.R4(this.f251817f);
        java.util.ArrayList arrayList = this.f251819h;
        if (R4) {
            arrayList.add(getActivity().getResources().getString(com.tencent.mm.R.string.ich));
        }
        arrayList.add(getActivity().getResources().getString(com.tencent.mm.R.string.icd));
        arrayList.add(getActivity().getResources().getString(com.tencent.mm.R.string.icg));
        arrayList.add(getActivity().getResources().getString(com.tencent.mm.R.string.ice));
        arrayList.add(getActivity().getResources().getString(com.tencent.mm.R.string.ick));
        arrayList.add(getActivity().getResources().getString(com.tencent.mm.R.string.ici));
        arrayList.add(getActivity().getResources().getString(com.tencent.mm.R.string.icj));
        arrayList.add(getActivity().getResources().getString(com.tencent.mm.R.string.icc));
        arrayList.add(getActivity().getResources().getString(com.tencent.mm.R.string.icf));
        arrayList.add(getActivity().getResources().getString(com.tencent.mm.R.string.p7h));
        arrayList.add(getActivity().getResources().getString(com.tencent.mm.R.string.p7f));
        arrayList.add(getActivity().getResources().getString(com.tencent.mm.R.string.p7g));
        arrayList.add(getActivity().getResources().getString(com.tencent.mm.R.string.oga));
        arrayList.add(getActivity().getResources().getString(com.tencent.mm.R.string.og_));
        if (this.f251820i) {
            arrayList.add(getActivity().getResources().getString(com.tencent.mm.R.string.p7e));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiSearchEduUIC", "initView");
        jz5.g gVar = this.f251816e;
        java.lang.Object value = ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        ((androidx.recyclerview.widget.RecyclerView) value).setLayoutManager(new androidx.recyclerview.widget.GridLayoutManager(getActivity(), 3));
        java.lang.Object value2 = ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.f(value2, "getValue(...)");
        ((androidx.recyclerview.widget.RecyclerView) value2).N(new ee5.x2(this));
        java.lang.Object value3 = ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.f(value3, "getValue(...)");
        ((androidx.recyclerview.widget.RecyclerView) value3).setAdapter(new zd5.j(arrayList, new ee5.y2(this)));
    }
}
