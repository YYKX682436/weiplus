package com.tencent.mm.plugin.recordvideo.ui.editor;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0016B\u0019\b\u0016\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#B!\b\u0016\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010$\u001a\u00020\u0006¢\u0006\u0004\b\"\u0010%J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002J\u0017\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u001d\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006&"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioSearchView;", "Landroid/widget/RelativeLayout;", "", "visible", "Ljz5/f0;", "setImeVisibility", "", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "setScene", "isShow", "setShow", "position", "setSelection", "(Ljava/lang/Integer;)V", "", "B", "J", "getMRelatedRecId", "()J", "setMRelatedRecId", "(J)V", "mRelatedRecId", "Lwu3/i;", "C", "Lwu3/i;", "getCallback", "()Lwu3/i;", "setCallback", "(Lwu3/i;)V", "callback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "style", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class EditorAudioSearchView extends android.widget.RelativeLayout {
    public static final /* synthetic */ int H = 0;
    public long A;

    /* renamed from: B, reason: from kotlin metadata */
    public long mRelatedRecId;

    /* renamed from: C, reason: from kotlin metadata */
    public wu3.i callback;
    public int D;
    public wt3.z E;
    public final wu3.s F;
    public final java.lang.Runnable G;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f155950d;

    /* renamed from: e, reason: collision with root package name */
    public int f155951e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f155952f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f155953g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f155954h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f155955i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f155956m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.EditText f155957n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.Button f155958o;

    /* renamed from: p, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f155959p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f155960q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.LinearLayout f155961r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.ImageView f155962s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.ImageView f155963t;

    /* renamed from: u, reason: collision with root package name */
    public su3.m f155964u;

    /* renamed from: v, reason: collision with root package name */
    public long f155965v;

    /* renamed from: w, reason: collision with root package name */
    public int f155966w;

    /* renamed from: x, reason: collision with root package name */
    public int f155967x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f155968y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo f155969z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditorAudioSearchView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.f155950d = "MicroMsg.EditorAudioSearchView";
        this.f155967x = -1;
        st3.v vVar = st3.v.f412605d;
        this.D = 0;
        this.F = new wu3.s(this);
        this.G = new wu3.u(this);
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setImeVisibility(boolean z17) {
        java.lang.Runnable runnable = this.G;
        if (z17) {
            post(runnable);
            return;
        }
        removeCallbacks(runnable);
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        }
    }

    public final void b() {
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a callback;
        f();
        wt3.u uVar = wt3.v.f449504h;
        wt3.v.f449506j.f61552e = 1L;
        uVar.a();
        g();
        android.widget.EditText editText = this.f155957n;
        if (editText != null) {
            editText.clearFocus();
        }
        wu3.i iVar = this.callback;
        if (iVar != null && (callback = ((com.tencent.mm.plugin.recordvideo.ui.editor.d) iVar).f156123a.getCallback()) != null) {
            callback.a();
        }
        wu3.i iVar2 = this.callback;
        if (iVar2 != null) {
            com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView editorAudioView = ((com.tencent.mm.plugin.recordvideo.ui.editor.d) iVar2).f156123a;
            editorAudioView.setShowAudioPanel(true);
            editorAudioView.j(false);
            if (editorAudioView.getWithMusic()) {
                editorAudioView.g(editorAudioView.L, true);
            } else {
                editorAudioView.K.z(null);
                com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a callback2 = editorAudioView.getCallback();
                if (callback2 != null) {
                    callback2.m(null);
                }
            }
            com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a callback3 = editorAudioView.getCallback();
            if (callback3 != null) {
                callback3.d();
            }
        }
    }

    public final void c(boolean z17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f155968y)) {
            return;
        }
        if (!z17) {
            android.widget.LinearLayout linearLayout = this.f155961r;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f155959p;
            if (recyclerView != null) {
                recyclerView.setVisibility(8);
            }
            android.widget.TextView textView = this.f155960q;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
        wt3.z zVar = this.E;
        if (zVar != null) {
            zVar.j();
        }
        long j17 = this.f155965v;
        java.lang.String str = this.f155968y;
        kotlin.jvm.internal.o.d(str);
        wt3.z zVar2 = new wt3.z(j17, str, this.f155966w, this.mRelatedRecId, 0, this.D, 16, null);
        this.E = zVar2;
        pq5.g l17 = zVar2.l();
        if (l17 != null) {
            l17.h(new wu3.j(this, z17));
        }
    }

    public final void d() {
        android.view.View.inflate(getContext(), com.tencent.mm.R.layout.cwf, this);
        this.f155955i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.nm7);
        this.f155956m = (android.widget.TextView) findViewById(com.tencent.mm.R.id.nml);
        this.f155957n = (android.widget.EditText) findViewById(com.tencent.mm.R.id.nm8);
        this.f155958o = (android.widget.Button) findViewById(com.tencent.mm.R.id.nmb);
        this.f155959p = (androidx.recyclerview.widget.RecyclerView) findViewById(com.tencent.mm.R.id.nmh);
        this.f155960q = (android.widget.TextView) findViewById(com.tencent.mm.R.id.nmf);
        this.f155961r = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.nme);
        this.f155962s = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.nm9);
        this.f155952f = findViewById(com.tencent.mm.R.id.nmk);
        this.f155953g = findViewById(com.tencent.mm.R.id.nmi);
        this.f155954h = findViewById(com.tencent.mm.R.id.nm6);
        this.f155963t = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.nm_);
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f155959p;
        if (recyclerView != null) {
            recyclerView.setFocusable(false);
        }
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.lang.Object systemService = context.getSystemService("window");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        android.view.Display defaultDisplay = ((android.view.WindowManager) systemService).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        float f17 = (17.0f * displayMetrics.density) / context.getResources().getDisplayMetrics().density;
        android.widget.TextView textView = this.f155955i;
        if (textView != null) {
            textView.setTextSize(1, f17);
        }
        android.widget.TextView textView2 = this.f155956m;
        if (textView2 != null) {
            textView2.setTextSize(1, f17);
        }
        android.widget.Button button = this.f155958o;
        if (button != null) {
            button.setTextSize(1, f17);
        }
        android.widget.ImageView imageView = this.f155963t;
        if (imageView != null) {
            imageView.setImageDrawable(com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.icons_filled_search, i65.a.d(getContext(), com.tencent.mm.R.color.a7d)));
        }
        android.widget.Button button2 = this.f155958o;
        if (button2 != null) {
            button2.setEnabled(false);
        }
        android.widget.ImageView imageView2 = this.f155962s;
        if (imageView2 != null) {
            imageView2.setImageDrawable(com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.icons_filled_close2, i65.a.d(getContext(), com.tencent.mm.R.color.a9z)));
        }
        android.widget.ImageView imageView3 = this.f155962s;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new wu3.k(this));
        }
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f155959p;
        android.view.ViewGroup.LayoutParams layoutParams = recyclerView2 != null ? recyclerView2.getLayoutParams() : null;
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = com.tencent.mm.ui.bl.c(getContext()) + i65.a.b(getContext(), 16);
        androidx.recyclerview.widget.RecyclerView recyclerView3 = this.f155959p;
        if (recyclerView3 != null) {
            recyclerView3.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext(), 1, false));
        }
        androidx.recyclerview.widget.RecyclerView recyclerView4 = this.f155959p;
        if (recyclerView4 != null) {
            recyclerView4.i(this.F);
        }
        su3.m mVar = new su3.m();
        this.f155964u = mVar;
        androidx.recyclerview.widget.RecyclerView recyclerView5 = this.f155959p;
        if (recyclerView5 != null) {
            recyclerView5.setAdapter(mVar);
        }
        android.widget.TextView textView3 = this.f155955i;
        if (textView3 != null) {
            textView3.setOnClickListener(new wu3.l(this));
        }
        android.widget.Button button3 = this.f155958o;
        if (button3 != null) {
            button3.setOnClickListener(new wu3.m(this));
        }
        android.widget.EditText editText = this.f155957n;
        if (editText != null) {
            editText.setOnFocusChangeListener(new wu3.n(this));
        }
        android.widget.EditText editText2 = this.f155957n;
        if (editText2 != null) {
            editText2.addTextChangedListener(new wu3.o(this));
        }
        android.widget.EditText editText3 = this.f155957n;
        if (editText3 != null) {
            editText3.setOnEditorActionListener(new wu3.p(this));
        }
        su3.m mVar2 = this.f155964u;
        if (mVar2 != null) {
            mVar2.f412801o = new wu3.q(this);
        }
        setOnClickListener(new wu3.r(this));
        int i17 = com.tencent.mm.ui.bl.b(getContext()).y;
        this.f155951e = i17;
        setTranslationY(i17);
        i();
    }

    public final void e() {
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a callback;
        su3.m mVar = this.f155964u;
        if (kotlin.jvm.internal.o.b(mVar != null ? mVar.f412795f : null, this.f155968y)) {
            com.tencent.mars.xlog.Log.w(this.f155950d, "refreshSearchList: same string, no need to update");
            return;
        }
        nu3.i iVar = nu3.i.f340218a;
        nu3.i.c(iVar, "KEY_SEARCH_MUSIC_COUNT_INT", 0, 2, null);
        java.lang.String str = this.f155968y;
        kotlin.jvm.internal.o.d(str);
        iVar.e("KEY_SEARCH_MUSIC_LIST_STRING", str);
        su3.m mVar2 = this.f155964u;
        if (mVar2 != null) {
            mVar2.z(null);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f155959p;
        if (recyclerView != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioSearchView", "refreshSearchList", "()V", "Undefined", "scrollToPosition", "(I)V");
            recyclerView.a1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(recyclerView, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioSearchView", "refreshSearchList", "()V", "Undefined", "scrollToPosition", "(I)V");
        }
        su3.m mVar3 = this.f155964u;
        if (mVar3 != null) {
            mVar3.B(new java.util.LinkedList());
        }
        android.widget.Button button = this.f155958o;
        if (button != null) {
            button.setEnabled(false);
        }
        this.f155965v = 0L;
        this.f155967x = -1;
        this.f155966w = 0;
        su3.m mVar4 = this.f155964u;
        if (mVar4 != null) {
            mVar4.f412795f = this.f155968y;
        }
        this.f155969z = null;
        this.A = 0L;
        android.view.View view = this.f155952f;
        if (view != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioSearchView", "showSearchPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioSearchView", "showSearchPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = this.f155953g;
        if (view2 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioSearchView", "showSearchPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioSearchView", "showSearchPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        c(false);
        wu3.i iVar2 = this.callback;
        if (iVar2 == null || (callback = ((com.tencent.mm.plugin.recordvideo.ui.editor.d) iVar2).f156123a.getCallback()) == null) {
            return;
        }
        callback.a();
    }

    public final void f() {
        if (this.f155969z != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            wt3.u uVar = wt3.v.f449504h;
            if (com.tencent.mm.sdk.platformtools.t8.K0(wt3.v.f449506j.f61553f)) {
                com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo = this.f155969z;
                sb6.append(audioCacheInfo != null ? java.lang.Integer.valueOf(audioCacheInfo.f155711e) : null);
                sb6.append(":1:");
                sb6.append(java.lang.System.currentTimeMillis() - this.A);
            } else {
                sb6.append(";");
                com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo2 = this.f155969z;
                sb6.append(audioCacheInfo2 != null ? java.lang.Integer.valueOf(audioCacheInfo2.f155711e) : null);
                sb6.append(":1:");
                sb6.append(java.lang.System.currentTimeMillis() - this.A);
            }
            com.tencent.mm.autogen.mmdata.rpt.VideoBGMSearchStruct videoBGMSearchStruct = wt3.v.f449506j;
            videoBGMSearchStruct.f61553f = videoBGMSearchStruct.b("Behavior", videoBGMSearchStruct.f61553f + ((java.lang.Object) sb6), true);
        }
    }

    public final void g() {
        com.tencent.mars.xlog.Log.i(this.f155950d, "reset");
        this.f155966w = 0;
        this.f155967x = -1;
        this.f155965v = 0L;
        android.widget.Button button = this.f155958o;
        if (button != null) {
            button.setEnabled(false);
        }
        android.widget.EditText editText = this.f155957n;
        if (editText != null) {
            editText.setText((java.lang.CharSequence) null);
        }
        su3.m mVar = this.f155964u;
        if (mVar != null) {
            mVar.f412795f = "";
        }
        if (mVar != null) {
            mVar.z(null);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f155959p;
        if (recyclerView != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioSearchView", "reset", "()V", "Undefined", "scrollToPosition", "(I)V");
            recyclerView.a1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(recyclerView, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioSearchView", "reset", "()V", "Undefined", "scrollToPosition", "(I)V");
        }
        su3.m mVar2 = this.f155964u;
        if (mVar2 != null) {
            mVar2.B(new java.util.LinkedList());
        }
        i();
        this.f155968y = null;
        this.f155969z = null;
        this.A = 0L;
        wt3.z zVar = this.E;
        if (zVar != null) {
            zVar.j();
        }
        this.E = null;
    }

    public final wu3.i getCallback() {
        return this.callback;
    }

    public final long getMRelatedRecId() {
        return this.mRelatedRecId;
    }

    public final void h(int i17) {
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a callback;
        su3.m mVar = this.f155964u;
        boolean z17 = false;
        if (mVar != null && mVar.f412794e == i17) {
            return;
        }
        this.f155967x = i17;
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo x17 = mVar != null ? mVar.x(i17) : null;
        if (x17 != null && x17.f155718o == 4) {
            wu3.i iVar = this.callback;
        } else {
            if (x17 != null && x17.f155718o == 3) {
                su3.m mVar2 = this.f155964u;
                if (mVar2 != null) {
                    mVar2.z(java.lang.Integer.valueOf(i17));
                }
                wu3.i iVar2 = this.callback;
                if (iVar2 != null) {
                    com.tencent.mm.plugin.recordvideo.ui.editor.d dVar = (com.tencent.mm.plugin.recordvideo.ui.editor.d) iVar2;
                    if (x17 != null && x17.f155718o == 3) {
                        z17 = true;
                    }
                    if (z17 && (callback = dVar.f156123a.getCallback()) != null) {
                        callback.m(x17);
                    }
                }
                android.widget.Button button = this.f155958o;
                if (button != null) {
                    button.setEnabled(true);
                }
                f();
            }
        }
        this.f155969z = x17;
        this.A = java.lang.System.currentTimeMillis();
    }

    public final void i() {
        android.view.View view = this.f155952f;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioSearchView", "showTagsPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioSearchView", "showTagsPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = this.f155953g;
        if (view2 == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioSearchView", "showTagsPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioSearchView", "showTagsPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void setCallback(wu3.i iVar) {
        this.callback = iVar;
    }

    public final void setMRelatedRecId(long j17) {
        this.mRelatedRecId = j17;
    }

    public final void setScene(int i17) {
        com.tencent.mars.xlog.Log.i(this.f155950d, "setScene() called with: scene = " + i17);
        this.D = i17;
    }

    public final void setSelection(java.lang.Integer position) {
        su3.m mVar = this.f155964u;
        if (mVar != null) {
            mVar.z(position);
        }
    }

    public final void setShow(boolean z17) {
        if (!z17) {
            animate().translationY(this.f155951e).withEndAction(new wu3.t(this)).start();
            android.widget.EditText editText = this.f155957n;
            if (editText != null) {
                editText.clearFocus();
                return;
            }
            return;
        }
        wt3.u uVar = wt3.v.f449504h;
        wt3.v.f449506j.f61556i = this.mRelatedRecId;
        setVisibility(0);
        animate().translationY(0.0f).start();
        android.widget.EditText editText2 = this.f155957n;
        if (editText2 != null) {
            editText2.requestFocus();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditorAudioSearchView(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.f155950d = "MicroMsg.EditorAudioSearchView";
        this.f155967x = -1;
        st3.v vVar = st3.v.f412605d;
        this.D = 0;
        this.F = new wu3.s(this);
        this.G = new wu3.u(this);
        d();
    }
}
