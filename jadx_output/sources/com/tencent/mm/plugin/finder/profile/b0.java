package com.tencent.mm.plugin.finder.profile;

/* loaded from: classes2.dex */
public final class b0 implements tj5.n {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f123313d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.view.RefreshLoadMoreLayout f123314e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f123315f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMProcessBar f123316g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f123317h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f123318i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.profile.z f123319m;

    /* renamed from: n, reason: collision with root package name */
    public yz5.l f123320n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f123321o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.ui.search.FTSSearchView f123322p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f123323q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.profile.w f123324r;

    /* renamed from: s, reason: collision with root package name */
    public long f123325s;

    public b0(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f123313d = context;
        this.f123317h = new java.util.LinkedList();
        this.f123318i = new java.util.LinkedList();
    }

    @Override // tj5.m
    public void C3(java.lang.String str, java.lang.String str2, java.util.List list, tj5.o oVar) {
        if (str == null || str.length() == 0) {
            a();
        } else {
            b();
        }
    }

    @Override // tj5.n
    public boolean G0() {
        com.tencent.mm.ui.search.FTSEditTextView ftsEditText;
        b();
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView = this.f123322p;
        if (fTSSearchView == null || (ftsEditText = fTSSearchView.getFtsEditText()) == null) {
            return true;
        }
        ftsEditText.h();
        return true;
    }

    @Override // tj5.n
    public void U1(boolean z17) {
    }

    public final void a() {
        this.f123325s = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("Finder.FinderProfilePoiListView", "[clearSearch] lastQueryTime=" + this.f123325s);
        java.util.LinkedList linkedList = this.f123317h;
        linkedList.clear();
        linkedList.addAll(this.f123318i);
        c(linkedList.size());
        com.tencent.mm.plugin.finder.profile.z zVar = this.f123319m;
        if (zVar != null) {
            zVar.notifyDataSetChanged();
        } else {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
    }

    public final void b() {
        com.tencent.mm.ui.search.FTSEditTextView ftsEditText;
        android.widget.EditText editText;
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView = this.f123322p;
        java.lang.String valueOf = java.lang.String.valueOf((fTSSearchView == null || (ftsEditText = fTSSearchView.getFtsEditText()) == null || (editText = ftsEditText.getEditText()) == null) ? null : editText.getText());
        com.tencent.mm.plugin.finder.profile.w wVar = this.f123324r;
        if (wVar != null) {
            java.lang.String str = this.f123323q;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mars.xlog.Log.i("Finder.UserPoiHandler", "[requestPoiSearch] query=" + valueOf + ", finderUsername=" + str + " queryTime=" + currentTimeMillis);
            wVar.f(false);
            com.tencent.mm.plugin.finder.profile.FinderProfilePoiDrawer finderProfilePoiDrawer = wVar.f124450g;
            if (finderProfilePoiDrawer != null) {
                finderProfilePoiDrawer.post(new com.tencent.mm.plugin.finder.profile.t(valueOf, str, wVar, currentTimeMillis));
            }
        }
    }

    public final void c(int i17) {
        android.widget.TextView textView;
        android.view.View view = this.f123321o;
        if (view == null || (textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.d4v)) == null) {
            return;
        }
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        android.content.res.Resources resources = textView.getContext().getResources();
        textView.setText(resources != null ? resources.getString(com.tencent.mm.R.string.eul, java.lang.Integer.valueOf(i17)) : null);
    }

    @Override // tj5.n
    public void o3(int i17, tj5.x xVar) {
    }

    @Override // tj5.n
    public void onClickClearTextBtn(android.view.View view) {
        a();
    }
}
