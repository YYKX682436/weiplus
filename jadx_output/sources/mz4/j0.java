package mz4;

/* loaded from: classes12.dex */
public class j0 implements lz4.d {

    /* renamed from: v, reason: collision with root package name */
    public static mz4.j0 f333290v;

    /* renamed from: w, reason: collision with root package name */
    public static int f333291w;

    /* renamed from: x, reason: collision with root package name */
    public static android.util.DisplayMetrics f333292x;

    /* renamed from: a, reason: collision with root package name */
    public boolean f333293a;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.wenote.ui.nativenote.g2 f333300h;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f333302j;

    /* renamed from: s, reason: collision with root package name */
    public mz4.n0 f333311s;

    /* renamed from: b, reason: collision with root package name */
    public long f333294b = -1;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f333295c = "";

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f333296d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f333297e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f333298f = "";

    /* renamed from: i, reason: collision with root package name */
    public long f333301i = -1;

    /* renamed from: k, reason: collision with root package name */
    public long f333303k = -1;

    /* renamed from: l, reason: collision with root package name */
    public lz4.c f333304l = null;

    /* renamed from: m, reason: collision with root package name */
    public boolean f333305m = false;

    /* renamed from: n, reason: collision with root package name */
    public int f333306n = -1;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f333307o = null;

    /* renamed from: p, reason: collision with root package name */
    public long f333308p = -1;

    /* renamed from: q, reason: collision with root package name */
    public int f333309q = 0;

    /* renamed from: r, reason: collision with root package name */
    public boolean f333310r = false;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.View.OnKeyListener f333312t = new mz4.k0(this);

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f333313u = new com.tencent.mm.sdk.platformtools.b4(new mz4.l0(this), true);

    /* renamed from: g, reason: collision with root package name */
    public final transient java.util.ArrayList f333299g = new java.util.ArrayList();

    public j0(com.tencent.mm.plugin.wenote.ui.nativenote.g2 g2Var) {
        this.f333302j = "";
        this.f333300h = g2Var;
        f333290v = this;
        com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI = (com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI) g2Var;
        o25.n1.a(noteEditorUI.getContext());
        com.tencent.mm.ui.bk.q(noteEditorUI.getContext());
        f333291w = com.tencent.mm.sdk.platformtools.d2.f(noteEditorUI.getContext())[0];
        android.util.DisplayMetrics displayMetrics = noteEditorUI.getContext().getResources().getDisplayMetrics();
        f333292x = displayMetrics;
        android.util.TypedValue.applyDimension(1, 8.0f, displayMetrics);
        this.f333302j = noteEditorUI.J1.p(false);
        oz4.n.f350288h = 0.0f;
    }

    public void a() {
        ((ku5.t0) ku5.t0.f312615d).h(new mz4.m0(this), "AddFavNoteSync");
    }

    public com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText b() {
        mz4.d dVar = ((com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI) this.f333300h).J1;
        java.util.ArrayList arrayList = this.f333299g;
        dVar.getClass();
        if (arrayList != null) {
            arrayList.clear();
            synchronized (dVar) {
                java.util.List<iz4.c> list = dVar.f333229a;
                if (list != null) {
                    for (iz4.c cVar : list) {
                        com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText wXRTEditText = cVar.f296108f;
                        if (wXRTEditText != null) {
                            arrayList.add(wXRTEditText);
                        } else {
                            com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText wXRTEditText2 = cVar.f296106d;
                            if (wXRTEditText2 != null && cVar.f296107e != null) {
                                arrayList.add(wXRTEditText2);
                                arrayList.add(cVar.f296107e);
                            }
                            if (((java.util.LinkedList) cVar.f296109g).size() > 0) {
                                arrayList.addAll(cVar.f296109g);
                            }
                        }
                    }
                }
            }
        }
        java.util.ArrayList arrayList2 = this.f333299g;
        if (arrayList2 == null) {
            return null;
        }
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText wXRTEditText3 = (com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText) it.next();
            if (wXRTEditText3.hasFocus()) {
                return wXRTEditText3;
            }
        }
        return null;
    }

    public boolean c(com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText wXRTEditText, java.lang.Class cls) {
        if (wXRTEditText != null && wXRTEditText.getEditTextType() == 0) {
            java.util.Iterator it = oz4.w.f350321g.iterator();
            while (it.hasNext()) {
                if (cls.isInstance((oz4.v) it.next())) {
                    return !r2.d(wXRTEditText.getText(), r2.c(wXRTEditText), oz4.u.SPAN_FLAGS).isEmpty();
                }
            }
        }
        return false;
    }

    public com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText d() {
        com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText b17 = b();
        if (b17 != null) {
            return b17;
        }
        java.util.ArrayList arrayList = this.f333299g;
        return arrayList.size() >= 1 ? (com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText) arrayList.get(arrayList.size() - 1) : b17;
    }

    public final boolean e(java.lang.String str) {
        com.tencent.mm.plugin.wenote.ui.nativenote.g2 g2Var = this.f333300h;
        com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI = (com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI) g2Var;
        noteEditorUI.getClass();
        java.lang.String str2 = noteEditorUI.I;
        java.lang.String p17 = ((com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI) g2Var).J1.p(false);
        boolean equals = p17.equals(str2);
        boolean equals2 = p17.equals(this.f333302j);
        com.tencent.mars.xlog.Log.i("MicroMsg.Note.WXRTManager", "isSameHtmlContent() called isSameWithLastUICommit:%b isSameWithLastUpdate:%b, source=%s", java.lang.Boolean.valueOf(equals), java.lang.Boolean.valueOf(equals2), str);
        return equals || equals2;
    }

    public void f() {
        this.f333313u.d();
        this.f333301i = -1L;
        if (f333290v == this) {
            f333290v = null;
        }
    }

    public void g(oz4.v vVar, java.lang.Object obj) {
        com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText b17 = b();
        if (b17 != null) {
            if (b17.getEditTextType() == 0) {
                int i17 = b17.getSelection().f333350d;
                int length = b17.getText().length();
                if ((obj instanceof java.lang.Boolean) && ((java.lang.Boolean) obj).booleanValue() && i17 == length) {
                    b17.x();
                    b17.getText().append("\n");
                    b17.C();
                    b17.setSelection(i17);
                }
                b17.u(vVar, obj);
            } else {
                b17.M = true;
                b17.L = vVar.b();
                b17.getText().append("\n");
            }
        }
        n(b17);
    }

    public void h(com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText wXRTEditText, android.text.Spannable spannable, android.text.Spannable spannable2, int i17, int i18, int i19, int i27) {
        android.view.View findViewById;
        java.lang.String w17 = wXRTEditText.w(mz4.h0.f333283b);
        int editTextType = wXRTEditText.getEditTextType();
        com.tencent.mm.plugin.wenote.ui.nativenote.g2 g2Var = this.f333300h;
        if (editTextType == 0) {
            iz4.c l17 = ((com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI) g2Var).J1.l(wXRTEditText.getRecyclerItemPosition());
            if (l17 != null && l17.d() == 1) {
                int i28 = (spannable2 == null ? 0 : qz4.c.i(spannable2.toString())) - (spannable == null ? 0 : qz4.c.i(spannable.toString()));
                if (((com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI) g2Var).J1.f(i28, 0)) {
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI = (com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI) g2Var;
                    noteEditorUI.getClass();
                    noteEditorUI.v7();
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI2 = (com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI) g2Var;
                    noteEditorUI2.getClass();
                    noteEditorUI2.j3(wXRTEditText.getRecyclerItemPosition(), 0L);
                } else {
                    ((com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI) g2Var).J1.h();
                    iz4.i iVar = (iz4.i) l17;
                    iVar.f296105c = i27;
                    iVar.f296155t = w17;
                    iVar.f296104b = true;
                    com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteDataManager", "[onTextChanged] content = " + iVar.f296155t);
                    l17.f296110h = false;
                    mz4.d dVar = ((com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI) g2Var).J1;
                    dVar.f333233e += i28;
                    com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteDataManager", "[updateTextItemLength] mMaxTextLength = " + dVar.f333233e);
                }
            }
        } else {
            wXRTEditText.setText("");
            if (com.tencent.mm.sdk.platformtools.t8.K0(w17)) {
                return;
            }
            iz4.i iVar2 = new iz4.i();
            iVar2.f296155t = w17.equals("<br/>") ? "" : w17;
            mz4.j jVar = mz4.j.f333289a;
            mz4.d dataManager = ((com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI) g2Var).J1;
            kotlin.jvm.internal.o.g(dataManager, "dataManager");
            if (!jVar.a(dataManager, wXRTEditText, w17, kz5.b0.c(iVar2))) {
                int t17 = ((com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI) g2Var).J1.t(iVar2, wXRTEditText, true, true, true, false, false);
                ((com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI) g2Var).J1.e(t17 - 1, t17 + 1, true);
            }
        }
        wXRTEditText.setContentDescription(qz4.c.l(w17, wXRTEditText.getContext()));
        mz4.n0 n0Var = this.f333311s;
        if (n0Var == null || (findViewById = ((com.tencent.mm.plugin.wenote.ui.nativenote.a0) n0Var).f188177a.findViewById(com.tencent.mm.R.id.f482482fq)) == null) {
            return;
        }
        if (wXRTEditText.length() > 0) {
            findViewById.setTag(com.tencent.mm.R.id.nwn, "0");
        } else {
            findViewById.setTag(com.tencent.mm.R.id.nwn, "1");
        }
    }

    public void i(int i17, long j17) {
        com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI = (com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI) this.f333300h;
        noteEditorUI.getClass();
        noteEditorUI.y7(i17, j17);
    }

    public void j(boolean z17, long j17) {
        com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI = (com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI) this.f333300h;
        noteEditorUI.getClass();
        noteEditorUI.z7(z17, j17);
    }

    public void k(com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText wXRTEditText) {
        if (wXRTEditText.C == 0) {
            wXRTEditText.setTextSize(0, i65.a.h(wXRTEditText.getContext(), com.tencent.mm.R.dimen.f479897ia));
        }
        mz4.b.f333226d = wXRTEditText.getTextSize();
        wXRTEditText.f188116r = this;
        wXRTEditText.setRichTextEditing(null);
        wXRTEditText.setOnKeyListener(this.f333312t);
    }

    public final void l() {
        if (this.f333301i >= 0 || this.f333303k <= 0) {
            return;
        }
        this.f333313u.c(60000L, 60000L);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f333301i = android.os.SystemClock.elapsedRealtime();
        this.f333302j = ((com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI) this.f333300h).J1.p(false);
    }

    public final synchronized void m(java.lang.String str, boolean z17) {
        com.tencent.mm.autogen.events.FavoriteOperationEvent favoriteOperationEvent = new com.tencent.mm.autogen.events.FavoriteOperationEvent();
        am.z9 z9Var = favoriteOperationEvent.f54243g;
        z9Var.f8528a = 19;
        z9Var.f8531d = ((com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI) this.f333300h).J1.n(str);
        am.z9 z9Var2 = favoriteOperationEvent.f54243g;
        if (z9Var2.f8531d == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Note.WXRTManager", "updateNoteInfoStorage error, favProtoItem is null");
            return;
        }
        z9Var2.f8529b = str;
        z9Var2.f8532e = this.f333303k;
        z9Var2.f8540m = z17 ? 1 : 0;
        z9Var2.f8530c = "fav_update_note_storage";
        favoriteOperationEvent.e();
        if (z17) {
            this.f333306n = favoriteOperationEvent.f54243g.f8534g.getIntExtra("fav_note_item_status", -1);
            this.f333307o = favoriteOperationEvent.f54243g.f8534g.getStringExtra("fav_note_xml");
            this.f333308p = favoriteOperationEvent.f54243g.f8534g.getLongExtra("fav_note_item_updatetime", -1L);
        }
    }

    public void n(com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText wXRTEditText) {
        ((tz4.l) this.f333304l).b(tz4.u.Bold, c(wXRTEditText, oz4.b.class) && wXRTEditText.hasFocus());
        ((tz4.l) this.f333304l).b(tz4.u.Highlight, c(wXRTEditText, oz4.f.class) && wXRTEditText.hasFocus());
        ((tz4.l) this.f333304l).b(tz4.u.Paragraph_UL, c(wXRTEditText, oz4.c.class) && wXRTEditText.hasFocus());
        ((tz4.l) this.f333304l).b(tz4.u.Paragraph_OL, c(wXRTEditText, oz4.m.class) && wXRTEditText.hasFocus());
        ((tz4.l) this.f333304l).b(tz4.u.Paragraph_Todo, c(wXRTEditText, oz4.k.class) && wXRTEditText.hasFocus());
    }
}
