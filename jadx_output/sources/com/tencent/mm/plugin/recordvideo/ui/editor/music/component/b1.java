package com.tencent.mm.plugin.recordvideo.ui.editor.music.component;

/* loaded from: classes5.dex */
public abstract class b1 extends com.tencent.mm.plugin.recordvideo.ui.editor.music.component.a implements com.tencent.mm.plugin.recordvideo.ui.editor.music.component.d, ev3.b {
    public ev3.d A;
    public ev3.e B;
    public final im5.c C;
    public final java.lang.Runnable D;
    public boolean E;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f156170h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f156171i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f156172m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f156173n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.EditText f156174o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageView f156175p;

    /* renamed from: q, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f156176q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f156177r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.LinearLayout f156178s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f156179t;

    /* renamed from: u, reason: collision with root package name */
    public dv3.c f156180u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f156181v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f156182w;

    /* renamed from: x, reason: collision with root package name */
    public wt3.z f156183x;

    /* renamed from: y, reason: collision with root package name */
    public long f156184y;

    /* renamed from: z, reason: collision with root package name */
    public int f156185z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(android.view.ViewGroup parent, com.tencent.mm.plugin.recordvideo.ui.editor.music.component.j0 status, boolean z17) {
        super(parent, status);
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(status, "status");
        this.f156170h = "MicroMsg.MusicSearchInputComponent";
        st3.v vVar = st3.v.f412605d;
        this.C = new im5.c();
        this.D = new com.tencent.mm.plugin.recordvideo.ui.editor.music.component.a1(this);
    }

    public static final void q(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.b1 b1Var, boolean z17) {
        android.widget.EditText editText = b1Var.f156174o;
        if (editText != null) {
            com.tencent.mars.xlog.Log.i(b1Var.y(), "setImeVisibility: " + z17);
            java.lang.Runnable runnable = b1Var.D;
            if (z17) {
                editText.post(runnable);
                return;
            }
            editText.removeCallbacks(runnable);
            android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) b1Var.f156168g.getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
            }
        }
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.component.d
    public void A() {
        if (kotlin.jvm.internal.o.b(this.f156182w, this.f156181v)) {
            com.tencent.mars.xlog.Log.w(y(), "refreshSearchList: same string, no need to update");
            return;
        }
        nu3.i iVar = nu3.i.f340218a;
        nu3.i.c(iVar, "KEY_SEARCH_MUSIC_COUNT_INT", 0, 2, null);
        java.lang.String str = this.f156181v;
        kotlin.jvm.internal.o.d(str);
        iVar.e("KEY_SEARCH_MUSIC_LIST_STRING", str);
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f156176q;
        if (recyclerView != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/music/component/MusicSearchInputComponent", "refreshSearchList", "()V", "Undefined", "scrollToPosition", "(I)V");
            recyclerView.a1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(recyclerView, "com/tencent/mm/plugin/recordvideo/ui/editor/music/component/MusicSearchInputComponent", "refreshSearchList", "()V", "Undefined", "scrollToPosition", "(I)V");
        }
        dv3.c cVar = this.f156180u;
        if (cVar != null) {
            cVar.T0(new java.util.LinkedList());
        }
        this.f156184y = 0L;
        dv3.c cVar2 = this.f156180u;
        if (cVar2 != null) {
            cVar2.K = 0;
        }
        this.f156182w = this.f156181v;
        u(false, com.tencent.mm.plugin.recordvideo.ui.editor.music.component.c1.f156188d);
    }

    public abstract boolean B();

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.component.d
    public java.lang.String C() {
        java.lang.String str = this.f156181v;
        return str == null ? "" : str;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.component.d
    /* renamed from: D */
    public dv3.c getF156356u() {
        return this.f156180u;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.component.d
    public void F() {
        android.widget.LinearLayout linearLayout = this.f156178s;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f156176q;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        android.widget.TextView textView = this.f156177r;
        if (textView == null) {
            return;
        }
        textView.setVisibility(8);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.component.d
    public void N() {
        android.widget.LinearLayout linearLayout = this.f156178s;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f156176q;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        android.widget.TextView textView = this.f156177r;
        if (textView == null) {
            return;
        }
        textView.setVisibility(0);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.component.d
    public android.app.Activity getActivity() {
        android.content.Context context = this.f156168g;
        if (context instanceof android.app.Activity) {
            return (android.app.Activity) context;
        }
        return null;
    }

    @Override // ev3.b
    public void h(android.view.View itemView, rv3.h feed, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(itemView, "itemView");
        kotlin.jvm.internal.o.g(feed, "feed");
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.component.d
    public void i0(java.util.ArrayList audioList, boolean z17) {
        kotlin.jvm.internal.o.g(audioList, "audioList");
        if (!z17) {
            this.f156185z = 0;
        }
        android.widget.LinearLayout linearLayout = this.f156178s;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f156176q;
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
        }
        android.widget.TextView textView = this.f156177r;
        if (textView != null) {
            textView.setVisibility(8);
        }
        if (z17) {
            dv3.c cVar = this.f156180u;
            if (cVar != null) {
                dv3.c.F0(cVar, audioList, false, 2, null);
                return;
            }
            return;
        }
        dv3.c cVar2 = this.f156180u;
        if (cVar2 != null) {
            cVar2.T0(audioList);
        }
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.component.d
    public void j(fv3.d statusEnum, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(statusEnum, "statusEnum");
        this.f266982d.j(statusEnum, bundle);
    }

    @Override // fv3.b
    public void m() {
        android.view.View n17 = n(com.tencent.mm.R.id.pza);
        this.f156171i = n17;
        if (n17 != null) {
            n17.setOnClickListener(new com.tencent.mm.plugin.recordvideo.ui.editor.music.component.v0(this));
        }
        android.view.View n18 = n(com.tencent.mm.R.id.pz7);
        this.f156172m = n18;
        if (n18 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(n18, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/music/component/MusicSearchInputComponent", "initSearchInputViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            n18.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(n18, "com/tencent/mm/plugin/recordvideo/ui/editor/music/component/MusicSearchInputComponent", "initSearchInputViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View n19 = n(com.tencent.mm.R.id.qgo);
        this.f156173n = n19;
        android.content.Context context = this.f156168g;
        if (n19 != null) {
            n19.setContentDescription(i65.a.r(context, com.tencent.mm.R.string.f490012ig));
        }
        android.view.View view = this.f156173n;
        if (view != null) {
            view.setOnClickListener(new com.tencent.mm.plugin.recordvideo.ui.editor.music.component.w0(this));
        }
        android.widget.EditText editText = (android.widget.EditText) n(com.tencent.mm.R.id.nm8);
        this.f156174o = editText;
        if (editText != null) {
            editText.setOnClickListener(new com.tencent.mm.plugin.recordvideo.ui.editor.music.component.x0(this));
        }
        android.widget.ImageView imageView = (android.widget.ImageView) n(com.tencent.mm.R.id.nm_);
        if (imageView != null) {
            imageView.setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_filled_search, i65.a.d(context, com.tencent.mm.R.color.FG_2)));
        }
        android.widget.ImageView imageView2 = (android.widget.ImageView) n(com.tencent.mm.R.id.nm9);
        this.f156175p = imageView2;
        if (imageView2 != null) {
            imageView2.setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_filled_close2, i65.a.d(context, com.tencent.mm.R.color.FG_2)));
        }
        android.widget.ImageView imageView3 = this.f156175p;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new com.tencent.mm.plugin.recordvideo.ui.editor.music.component.y0(this));
        }
        this.f156179t = n(com.tencent.mm.R.id.nma);
        this.f156176q = (androidx.recyclerview.widget.RecyclerView) n(com.tencent.mm.R.id.nmh);
        this.f156177r = (android.widget.TextView) n(com.tencent.mm.R.id.nmf);
        this.f156178s = (android.widget.LinearLayout) n(com.tencent.mm.R.id.nme);
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f156176q;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context, 1, false));
        }
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f156176q;
        if (recyclerView2 != null) {
            recyclerView2.i(new com.tencent.mm.plugin.recordvideo.ui.editor.music.component.z0(this));
        }
        dv3.c s17 = s(new java.util.ArrayList());
        this.f156180u = s17;
        if (s17 != null) {
            s17.f293105o = new com.tencent.mm.plugin.recordvideo.ui.editor.music.component.n0(this);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView3 = this.f156176q;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(s17);
        }
        android.widget.EditText editText2 = this.f156174o;
        if (editText2 != null) {
            editText2.setOnFocusChangeListener(new com.tencent.mm.plugin.recordvideo.ui.editor.music.component.r0(this));
        }
        android.widget.EditText editText3 = this.f156174o;
        if (editText3 != null) {
            editText3.addTextChangedListener(new com.tencent.mm.plugin.recordvideo.ui.editor.music.component.s0(this));
        }
        android.widget.EditText editText4 = this.f156174o;
        if (editText4 != null) {
            editText4.setOnEditorActionListener(new com.tencent.mm.plugin.recordvideo.ui.editor.music.component.t0(this));
        }
        ev3.d dVar = this.A;
        if (dVar != null) {
            dVar.c(x(), new com.tencent.mm.plugin.recordvideo.ui.editor.music.component.u0(this));
        }
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.component.a
    public void o(boolean z17) {
        fv3.c.a(this.f266982d, com.tencent.mm.plugin.recordvideo.ui.editor.music.component.i0.f156248h, null, 2, null);
        android.view.View view = this.f156172m;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/music/component/MusicSearchInputComponent", "hideSearchUI", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/recordvideo/ui/editor/music/component/MusicSearchInputComponent", "hideSearchUI", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        z();
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.component.d
    public void p(boolean z17) {
        this.E = z17;
    }

    public in5.s r(final yz5.a aVar, final yz5.p pVar) {
        return new in5.s() { // from class: com.tencent.mm.plugin.recordvideo.ui.editor.music.component.MusicSearchInputComponent$buildRVItemConverts$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                if (type == 2) {
                    return new rv3.k();
                }
                return new rv3.m(pVar, com.tencent.mm.plugin.recordvideo.ui.editor.music.component.b1.this, com.tencent.mm.plugin.recordvideo.ui.editor.music.component.b1.this.w(), com.tencent.mm.plugin.recordvideo.ui.editor.music.component.b1.this.v(), aVar);
            }
        };
    }

    public dv3.c s(java.util.ArrayList initData) {
        kotlin.jvm.internal.o.g(initData, "initData");
        return new dv3.e(r(new com.tencent.mm.plugin.recordvideo.ui.editor.music.component.o0(this), new com.tencent.mm.plugin.recordvideo.ui.editor.music.component.p0(this)), initData);
    }

    public com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo t(r45.mh4 protoInfo) {
        kotlin.jvm.internal.o.g(protoInfo, "protoInfo");
        return com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo.M.c(protoInfo, 3);
    }

    public void u(boolean z17, com.tencent.mm.plugin.recordvideo.ui.editor.music.component.c1 searchType) {
        kotlin.jvm.internal.o.g(searchType, "searchType");
        y();
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f156181v)) {
            return;
        }
        if (!z17) {
            F();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("key_string_1", this.f156181v);
            this.f266982d.j(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.i0.f156247g, bundle);
        }
        java.lang.String str = this.f156181v;
        if (str == null) {
            str = "";
        }
        wt3.z zVar = this.f156183x;
        if (zVar != null) {
            zVar.j();
        }
        long j17 = this.f156184y;
        dv3.c cVar = this.f156180u;
        wt3.z zVar2 = new wt3.z(j17, str, cVar != null ? cVar.K : 0, 0L, 0, 0, 16, null);
        this.f156183x = zVar2;
        pq5.g l17 = zVar2.l();
        if (l17 != null) {
            l17.f(this.C);
            l17.h(new com.tencent.mm.plugin.recordvideo.ui.editor.music.component.q0(this, str, z17));
        }
    }

    public boolean v() {
        return false;
    }

    public boolean w() {
        return false;
    }

    public int x() {
        return 3;
    }

    public java.lang.String y() {
        return this.f156170h;
    }

    public void z() {
        wt3.z zVar = this.f156183x;
        if (zVar != null) {
            zVar.j();
        }
        this.f156183x = null;
        dv3.c cVar = this.f156180u;
        if (cVar != null) {
            cVar.K = 0;
        }
        this.f156184y = 0L;
        android.widget.EditText editText = this.f156174o;
        if (editText != null) {
            editText.setText((java.lang.CharSequence) null);
        }
        this.f156181v = "";
        this.f156182w = "";
        this.f156185z = 0;
        dv3.c cVar2 = this.f156180u;
        if (cVar2 != null) {
            cVar2.T0(new java.util.LinkedList());
        }
    }
}
