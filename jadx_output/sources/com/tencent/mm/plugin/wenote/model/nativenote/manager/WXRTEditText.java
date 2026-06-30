package com.tencent.mm.plugin.wenote.model.nativenote.manager;

/* loaded from: classes12.dex */
public class WXRTEditText extends com.tencent.mm.ui.widget.edittext.PasterEditText implements android.text.SpanWatcher {
    public java.lang.String A;
    public android.text.Spannable B;
    public int C;
    public boolean D;
    public sz4.a E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public mz4.i0 f188113J;
    public boolean K;
    public int L;
    public boolean M;
    public int N;
    public android.graphics.Paint P;
    public com.tencent.mm.sdk.platformtools.b4 Q;
    public nz4.f R;
    public boolean S;
    public android.graphics.Path T;
    public int U;
    public int V;
    public int W;

    /* renamed from: l1, reason: collision with root package name */
    public int f188114l1;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f188115p0;

    /* renamed from: r, reason: collision with root package name */
    public lz4.d f188116r;

    /* renamed from: s, reason: collision with root package name */
    public int f188117s;

    /* renamed from: t, reason: collision with root package name */
    public int f188118t;

    /* renamed from: u, reason: collision with root package name */
    public lz4.b f188119u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f188120v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f188121w;

    /* renamed from: x, reason: collision with root package name */
    public int f188122x;

    /* renamed from: x0, reason: collision with root package name */
    public final android.text.TextWatcher f188123x0;

    /* renamed from: y, reason: collision with root package name */
    public int f188124y;

    /* renamed from: y0, reason: collision with root package name */
    public int f188125y0;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f188126z;

    public WXRTEditText(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f188117s = -1;
        this.f188118t = -1;
        this.f188120v = false;
        this.A = "";
        this.C = 0;
        this.D = false;
        this.H = false;
        this.K = false;
        this.L = 0;
        this.M = false;
        this.N = -1;
        this.P = null;
        this.Q = null;
        this.R = null;
        this.S = false;
        this.T = null;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.f188115p0 = false;
        this.f188123x0 = new mz4.d0(this);
        this.f188125y0 = 0;
        this.f188114l1 = -1;
        r();
    }

    private int getOffsetForButton() {
        int i17 = this.f188114l1;
        return i17 != -1 ? i17 : this.C == 2 ? 1 : 0;
    }

    private mz4.i0 getRTLayout() {
        mz4.i0 i0Var;
        synchronized (this) {
            if (this.f188113J == null || this.I) {
                this.f188113J = new mz4.i0(getText());
                this.I = false;
            }
            i0Var = this.f188113J;
        }
        return i0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void setParagraphsAreUp2Date(boolean z17) {
        if (!this.G) {
            this.F = z17;
        }
    }

    public void A(android.text.Spannable spannable) {
        int selectionStart = getSelectionStart();
        com.tencent.mm.smiley.x1 Di = com.tencent.mm.smiley.x1.Di();
        getContext();
        setSpannableText(Di.Ri(spannable, true));
        int length = getText().length() - spannable.length();
        if (length <= 0) {
            setSelection(selectionStart);
            return;
        }
        int i17 = selectionStart + length;
        if (i17 <= getText().length()) {
            setSelection(i17);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void B(int r9) {
        /*
            r8 = this;
            lz4.b r0 = r8.f188119u
            if (r0 == 0) goto L17
            sz4.q r0 = (sz4.q) r0
            sz4.r r0 = r0.f414216a
            com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText r0 = r0.f414222f
            if (r0 == 0) goto L10
            r0.B(r9)
            return
        L10:
            java.lang.String r9 = "btnPre"
            kotlin.jvm.internal.o.o(r9)
            r9 = 0
            throw r9
        L17:
            nz4.y r0 = nz4.y.h()
            boolean r1 = nz4.y.M
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L27
            boolean r0 = r0.f341643a
            if (r0 == 0) goto L2a
            r0 = r2
            goto L2b
        L27:
            r0.getClass()
        L2a:
            r0 = r3
        L2b:
            r4 = 50
            if (r0 == 0) goto L83
            boolean r0 = r8.hasFocus()
            if (r0 == 0) goto L4a
            int r0 = r8.getSelectionStart()
            int r1 = r8.getSelectionEnd()
            if (r0 != r1) goto L47
            int r0 = r8.getSelectionStart()
            if (r9 != r0) goto L47
            r0 = r2
            goto L4e
        L47:
            r0 = r2
            r1 = r3
            goto L4f
        L4a:
            r8.requestFocus()
            r0 = r3
        L4e:
            r1 = r0
        L4f:
            r8.setIgnoreSelectChangeByMultiSelect(r2)
            r8.setSelection(r9)
            r8.setIgnoreSelectChangeByMultiSelect(r3)
            lz4.d r3 = r8.f188116r
            if (r3 == 0) goto L78
            mz4.j0 r3 = (mz4.j0) r3
            com.tencent.mm.plugin.wenote.ui.nativenote.g2 r3 = r3.f333300h
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r3 = (com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI) r3
            boolean r3 = r3.F7()
            if (r3 != 0) goto L78
            lz4.d r3 = r8.f188116r
            mz4.j0 r3 = (mz4.j0) r3
            r3.j(r2, r4)
            lz4.d r3 = r8.f188116r
            r6 = 0
            mz4.j0 r3 = (mz4.j0) r3
            r3.i(r2, r6)
        L78:
            r8.F(r9, r9)
            nz4.y r9 = nz4.y.h()
            r9.D(r0, r1, r4)
            goto Lcd
        L83:
            nz4.y r0 = nz4.y.h()
            nz4.h r0 = r0.l()
            nz4.y r1 = nz4.y.h()
            android.widget.PopupWindow r1 = r1.f341660r
            if (r1 == 0) goto L9b
            boolean r1 = r1.isShowing()
            if (r1 == 0) goto L9b
            r1 = r2
            goto L9c
        L9b:
            r1 = r3
        L9c:
            if (r1 == 0) goto Laf
            int r1 = r0.a()
            if (r1 != r2) goto Laf
            int r1 = r0.f341619a
            int r6 = r8.N
            if (r1 != r6) goto Laf
            int r0 = r0.f341620b
            if (r0 != r9) goto Laf
            r3 = r2
        Laf:
            r8.F(r9, r9)
            nz4.y r9 = nz4.y.h()
            boolean r0 = nz4.y.M
            if (r0 != 0) goto Lbe
            r9.getClass()
            goto Lcd
        Lbe:
            r9.n()
            r9.p()
            r9.I(r2, r4)
            r9.A(r2)
            r9.C(r3)
        Lcd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText.B(int):void");
    }

    public synchronized void C() {
        this.f188121w = false;
    }

    public final void D() {
        nz4.f fVar = this.R;
        if (fVar == null) {
            this.R = new nz4.f();
            return;
        }
        fVar.f341602a = 0;
        fVar.f341603b = -1.0f;
        fVar.f341604c = -1.0f;
        fVar.f341605d = -1.0f;
        fVar.f341606e = -1.0f;
        fVar.f341607f = -1;
        fVar.f341608g = -1.0f;
        fVar.f341609h = -1.0f;
        fVar.f341610i = -1.0f;
        fVar.f341611j = -1.0f;
        fVar.f341612k = -1;
    }

    public final void E() {
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.Q;
        if (b4Var == null) {
            this.Q = new com.tencent.mm.sdk.platformtools.b4(new mz4.e0(this), false);
        } else {
            b4Var.d();
        }
    }

    public final void F(int i17, int i18) {
        int i19 = this.C;
        if (i19 == 2) {
            nz4.y.h().y(this.N, getOffsetForButton(), this.N, getOffsetForButton());
        } else {
            if (i19 == 1) {
                nz4.y.h().y(this.N, getOffsetForButton(), this.N, getOffsetForButton());
                return;
            }
            nz4.y h17 = nz4.y.h();
            int i27 = this.N;
            h17.y(i27, i17, i27, i18);
        }
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    public oz4.n[] getCurrentEditorCursorNumberSpan() {
        mz4.t paragraphsInSelection = getParagraphsInSelection();
        return (oz4.n[]) getText().getSpans(paragraphsInSelection.f333350d, paragraphsInSelection.f333351e, oz4.n.class);
    }

    public java.lang.String getCurrentEditorCursorParagraphStr() {
        mz4.t paragraphsInSelection = getParagraphsInSelection();
        return getText().subSequence(paragraphsInSelection.f333350d, paragraphsInSelection.f333351e).toString().trim();
    }

    public int getEditTextType() {
        return this.C;
    }

    public java.util.ArrayList<oz4.o> getParagraphs() {
        return getRTLayout().f333288e;
    }

    public mz4.t getParagraphsInSelection() {
        mz4.i0 rTLayout = getRTLayout();
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        if (selectionStart > selectionEnd) {
            selectionEnd = selectionStart;
            selectionStart = selectionEnd;
        }
        int a17 = rTLayout.a(selectionStart);
        int i17 = 0;
        if (!(selectionStart == selectionEnd)) {
            selectionEnd--;
        }
        int a18 = rTLayout.a(selectionEnd);
        java.util.ArrayList arrayList = rTLayout.f333288e;
        int i18 = rTLayout.f333287d;
        int i19 = (i18 == 0 || a17 < 0) ? 0 : a17 < i18 ? ((oz4.o) arrayList.get(a17)).f333350d : ((oz4.o) arrayList.get(i18 - 1)).f333351e - 1;
        if (i18 != 0 && a18 >= 0) {
            i17 = a18 < i18 ? ((oz4.o) arrayList.get(a18)).f333351e : ((oz4.o) arrayList.get(i18 - 1)).f333351e - 1;
        }
        return new mz4.t(i19, i17);
    }

    public int getPosInDataList() {
        return this.N;
    }

    public sz4.a getRecyclerHolder() {
        return this.E;
    }

    public int getRecyclerItemPosition() {
        if (this.E.getLayoutPosition() == -1) {
            return 0;
        }
        return this.E.getLayoutPosition();
    }

    public java.lang.String getSelectedText() {
        int i17;
        android.text.Editable text = getText();
        mz4.t selection = getSelection();
        if (selection.f333350d < 0 || (i17 = selection.f333351e) < 0 || i17 > text.length()) {
            return null;
        }
        return text.subSequence(selection.f333350d, selection.f333351e).toString();
    }

    public mz4.t getSelection() {
        return new mz4.t(getSelectionStart(), getSelectionEnd());
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        android.text.Editable text;
        boolean z17;
        int i17;
        boolean z18;
        android.text.Layout layout;
        int lineForOffset;
        int lineForOffset2;
        if (nz4.y.M && this.C == 0 && (text = getText()) != null) {
            nz4.h l17 = nz4.y.h().l();
            int g17 = nz4.y.h().g(this.N);
            int i18 = 0;
            if (g17 == 1) {
                int i19 = l17.f341620b;
                int i27 = l17.f341622d;
                if (i19 != i27) {
                    z17 = false;
                    i18 = i19;
                    i17 = i27;
                    z18 = false;
                }
            } else if (g17 == 2) {
                i17 = text.length();
                z18 = true;
                z17 = true;
            } else if (g17 == 3) {
                i17 = l17.f341622d;
                z17 = false;
                z18 = true;
            } else if (g17 != 4) {
                z18 = false;
                z17 = false;
                i17 = -1;
                i18 = -1;
            } else {
                int i28 = l17.f341620b;
                i17 = text.length();
                z17 = true;
                i18 = i28;
                z18 = false;
            }
            if (i18 >= 0 && i17 <= text.length() && i18 <= i17 && (layout = getLayout()) != null) {
                if (this.U == -1) {
                    this.U = getPaddingLeft();
                }
                if (this.V == -1) {
                    this.V = getPaddingTop();
                }
                if (this.W == -1) {
                    this.W = getPaddingBottom();
                }
                if (this.T == null) {
                    this.T = new android.graphics.Path();
                }
                this.T.reset();
                try {
                    lineForOffset = layout.getLineForOffset(i18);
                    lineForOffset2 = layout.getLineForOffset(i17);
                } catch (java.lang.Exception e17) {
                    e = e17;
                }
                if (lineForOffset <= lineForOffset2) {
                    int width = layout.getWidth();
                    float primaryHorizontal = layout.getPrimaryHorizontal(i18) + this.U;
                    float lineTop = layout.getLineTop(lineForOffset) + this.V;
                    float lineBottom = layout.getLineBottom(lineForOffset) + this.V;
                    float primaryHorizontal2 = layout.getPrimaryHorizontal(i17) + this.U;
                    float lineTop2 = layout.getLineTop(lineForOffset2) + this.V;
                    float lineBottom2 = layout.getLineBottom(lineForOffset2) + this.V;
                    if (z18 && z17) {
                        this.T.addRect(this.U, 0.0f, r2 + width, lineBottom2 + this.W, android.graphics.Path.Direction.CW);
                    } else if (lineForOffset != lineForOffset2) {
                        if (z18) {
                            this.T.addRect(this.U, 0.0f, r2 + width, lineBottom, android.graphics.Path.Direction.CW);
                            this.T.addRect(this.U, lineTop2, primaryHorizontal2, lineBottom2, android.graphics.Path.Direction.CW);
                        } else if (z17) {
                            this.T.addRect(primaryHorizontal, lineTop, this.U + width, lineBottom, android.graphics.Path.Direction.CW);
                            this.T.addRect(this.U, lineTop2, r2 + width, lineBottom2 + this.W, android.graphics.Path.Direction.CW);
                        } else {
                            this.T.addRect(primaryHorizontal, lineTop, this.U + width, lineBottom, android.graphics.Path.Direction.CW);
                            this.T.addRect(this.U, lineTop2, primaryHorizontal2, lineBottom2, android.graphics.Path.Direction.CW);
                        }
                        if (lineForOffset2 - lineForOffset > 1) {
                            this.T.addRect(this.U, lineBottom, r0 + width, lineTop2, android.graphics.Path.Direction.CW);
                        }
                    } else if (z18) {
                        this.T.addRect(this.U, 0.0f, primaryHorizontal2, lineBottom2, android.graphics.Path.Direction.CW);
                    } else if (z17) {
                        this.T.addRect(primaryHorizontal, lineTop, this.U + width, lineBottom2 + this.W, android.graphics.Path.Direction.CW);
                    } else {
                        this.T.addRect(primaryHorizontal, lineTop, primaryHorizontal2, lineBottom2, android.graphics.Path.Direction.CW);
                    }
                    if (!this.T.isEmpty()) {
                        if (this.P == null) {
                            android.graphics.Paint paint = new android.graphics.Paint(1);
                            this.P = paint;
                            paint.setColor(1347529272);
                        }
                        try {
                            canvas.drawPath(this.T, this.P);
                        } catch (java.lang.Exception e18) {
                            e = e18;
                            com.tencent.mars.xlog.Log.e("noteeditor.WXRTEditText", "tryDrawCover: ", e);
                            super.onDraw(canvas);
                        }
                        super.onDraw(canvas);
                    }
                }
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z17, int i17, android.graphics.Rect rect) {
        this.f188115p0 = false;
        this.f188117s = -1;
        this.f188118t = -1;
        super.onFocusChanged(z17, i17, rect);
        lz4.d dVar = this.f188116r;
        if (dVar != null) {
            int recyclerItemPosition = getRecyclerItemPosition();
            mz4.j0 j0Var = (mz4.j0) dVar;
            synchronized (j0Var) {
                if (z17) {
                    j0Var.l();
                }
                com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI = (com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI) j0Var.f333300h;
                noteEditorUI.getClass();
                noteEditorUI.r7(this, z17, recyclerItemPosition);
            }
        }
        if (!z17 || this.f188115p0) {
            return;
        }
        onSelectionChanged(getSelectionStart(), getSelectionEnd());
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int i17, int i18) {
        synchronized (this) {
            if (this.f188120v) {
                return;
            }
            this.f188115p0 = true;
            if (i17 < 0) {
                return;
            }
            if (this.f188117s != i17 || this.f188118t != i18) {
                this.f188117s = i17;
                this.f188118t = i18;
                super.onSelectionChanged(i17, i18);
                if (!this.F) {
                    this.G = true;
                    oz4.w.b(this, new oz4.v[0]);
                    this.G = false;
                    setParagraphsAreUp2Date(true);
                }
                lz4.d dVar = this.f188116r;
                if (dVar != null) {
                    this.H = true;
                    mz4.j0 j0Var = (mz4.j0) dVar;
                    if (j0Var.f333309q == 2 && j0Var.f333310r) {
                        com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI = (com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI) j0Var.f333300h;
                        noteEditorUI.getClass();
                        noteEditorUI.L = java.lang.Math.abs(i18 - i17) >= 1;
                        j0Var.n(this);
                    }
                    this.H = false;
                }
            }
            if (!nz4.y.M || this.S || !hasFocus() || this.N < 0) {
                return;
            }
            F(i17, i18);
            if (nz4.y.h().g(this.N) == 1) {
                nz4.y h17 = nz4.y.h();
                if (!nz4.y.M) {
                    h17.getClass();
                    return;
                }
                h17.I(true, 0L);
                h17.n();
                h17.p();
            }
        }
    }

    @Override // android.text.SpanWatcher
    public void onSpanAdded(android.text.Spannable spannable, java.lang.Object obj, int i17, int i18) {
        if ((obj instanceof oz4.h) && (obj instanceof android.text.style.ParagraphStyle)) {
            setParagraphsAreUp2Date(false);
        }
    }

    @Override // android.text.SpanWatcher
    public void onSpanChanged(android.text.Spannable spannable, java.lang.Object obj, int i17, int i18, int i19, int i27) {
        if ((obj instanceof oz4.h) && (obj instanceof android.text.style.ParagraphStyle)) {
            setParagraphsAreUp2Date(false);
        }
    }

    @Override // android.text.SpanWatcher
    public void onSpanRemoved(android.text.Spannable spannable, java.lang.Object obj, int i17, int i18) {
        if ((obj instanceof oz4.h) && (obj instanceof android.text.style.ParagraphStyle)) {
            setParagraphsAreUp2Date(false);
        }
    }

    @Override // com.tencent.mm.ui.widget.edittext.PasterEditText, android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i17) {
        if (i17 == 16908319) {
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI = (com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI) ((mz4.j0) this.f188116r).f333300h;
            noteEditorUI.getClass();
            if (!noteEditorUI.f188153q.f423359e) {
                noteEditorUI.b5();
                noteEditorUI.f188141J.postDelayed(new com.tencent.mm.plugin.wenote.ui.nativenote.u0(noteEditorUI, noteEditorUI.getContext()), 400L);
            }
            return true;
        }
        boolean z17 = false;
        if (i17 == 16908321 || i17 == 16908320) {
            mz4.u.a();
        } else if (i17 == 16908322) {
            int c17 = mz4.u.c(getContext());
            if (c17 == 2) {
                mz4.u.a();
            } else if (c17 == 3) {
                com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI2 = (com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI) ((mz4.j0) this.f188116r).f333300h;
                noteEditorUI2.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "onNotifyPasteFromWNNoteClipboard %s", java.lang.Long.valueOf(noteEditorUI2.A));
                java.util.ArrayList arrayList = mz4.u.f333353b;
                if (arrayList != null && arrayList.size() > 0) {
                    z17 = true;
                }
                if (z17) {
                    java.util.ArrayList b17 = mz4.u.b();
                    mz4.d dVar = noteEditorUI2.J1;
                    if (dVar.g(b17)) {
                        noteEditorUI2.v7();
                    } else {
                        noteEditorUI2.J1.u(b17, this, true, true, true, false, false);
                        int recyclerItemPosition = getRecyclerItemPosition();
                        dVar.e(recyclerItemPosition, b17.size() + recyclerItemPosition + 1, true);
                        noteEditorUI2.b5();
                        if (noteEditorUI2.C1) {
                            nz4.y.h().c();
                        }
                    }
                }
                return true;
            }
        }
        try {
            boolean onTextContextMenuItem = super.onTextContextMenuItem(i17);
            if (i17 == 16908322) {
                this.f188125y0 = 0;
                android.text.Editable text = getText();
                try {
                    A(text);
                } catch (java.lang.IndexOutOfBoundsException e17) {
                    com.tencent.mars.xlog.Log.e("noteeditor.WXRTEditText", "!!MMEditText Exception %d", java.lang.Integer.valueOf(this.f188125y0));
                    if (this.f188125y0 >= 3) {
                        throw e17;
                    }
                    this.f188125y0++;
                    A(new android.text.SpannableStringBuilder(android.text.TextUtils.concat(" ", text)));
                }
            }
            if (i17 == 16908322 && this.D) {
                lz4.d dVar2 = this.f188116r;
                if (dVar2 != null) {
                    ((mz4.j0) dVar2).j(false, 0L);
                    ((mz4.j0) this.f188116r).i(0, 0L);
                }
                this.D = false;
            }
            return onTextContextMenuItem;
        } catch (java.lang.NullPointerException e18) {
            com.tencent.mars.xlog.Log.e("noteeditor.WXRTEditText", "!!MMEditText NullPointerException %s", e18);
            return false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        lz4.d dVar;
        boolean z17;
        if (!nz4.y.M) {
            if (motionEvent.getAction() == 1 && (dVar = this.f188116r) != null) {
                ((mz4.j0) dVar).j(true, 300L);
                ((mz4.j0) this.f188116r).i(1, 0L);
            }
            return super.onTouchEvent(motionEvent);
        }
        android.text.Editable text = getText();
        if (text == null) {
            D();
            return true;
        }
        int length = text.length();
        int offsetForPosition = getOffsetForPosition(motionEvent.getX(), motionEvent.getY());
        if (length < 0 || offsetForPosition < 0 || offsetForPosition > length) {
            D();
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            int x17 = (int) motionEvent.getX();
            int y17 = (int) motionEvent.getY();
            android.text.Layout layout = getLayout();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(y17), x17);
            oz4.l[] lVarArr = (oz4.l[]) getText().getSpans(offsetForHorizontal, offsetForHorizontal + 1, oz4.l.class);
            nz4.y h17 = nz4.y.h();
            if (!nz4.y.M) {
                h17.getClass();
            } else if (h17.f341643a) {
                z17 = true;
                if (z17 || x17 >= mz4.b.b() || lVarArr.length == 0) {
                    D();
                    nz4.f fVar = this.R;
                    float rawX = motionEvent.getRawX();
                    float rawY = motionEvent.getRawY();
                    float x18 = motionEvent.getX();
                    float y18 = motionEvent.getY();
                    fVar.f341602a = 1;
                    fVar.f341603b = rawX;
                    fVar.f341604c = rawY;
                    fVar.f341605d = x18;
                    fVar.f341606e = y18;
                    fVar.f341607f = offsetForPosition;
                    E();
                    this.Q.c(500L, 0L);
                } else {
                    com.tencent.mars.xlog.Log.i("noteeditor.WXRTEditText", "clicked todo");
                    mz4.j0 j0Var = (mz4.j0) this.f188116r;
                    com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI = (com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI) j0Var.f333300h;
                    noteEditorUI.getClass();
                    noteEditorUI.n7();
                    j0Var.l();
                    oz4.l lVar = lVarArr[0];
                    lVar.b(this, text, motionEvent, lVar);
                }
            }
            z17 = false;
            if (z17) {
            }
            D();
            nz4.f fVar2 = this.R;
            float rawX2 = motionEvent.getRawX();
            float rawY2 = motionEvent.getRawY();
            float x182 = motionEvent.getX();
            float y182 = motionEvent.getY();
            fVar2.f341602a = 1;
            fVar2.f341603b = rawX2;
            fVar2.f341604c = rawY2;
            fVar2.f341605d = x182;
            fVar2.f341606e = y182;
            fVar2.f341607f = offsetForPosition;
            E();
            this.Q.c(500L, 0L);
        } else if (action == 1) {
            E();
            nz4.f fVar3 = this.R;
            if (fVar3 != null) {
                float rawX3 = motionEvent.getRawX();
                float rawY3 = motionEvent.getRawY();
                float x19 = motionEvent.getX();
                float y19 = motionEvent.getY();
                fVar3.f341608g = rawX3;
                fVar3.f341609h = rawY3;
                fVar3.f341610i = x19;
                fVar3.f341611j = y19;
                if (fVar3.f341602a == 1) {
                    fVar3.f341612k = offsetForPosition;
                } else {
                    fVar3.f341612k = 0;
                }
                int a17 = this.R.a();
                D();
                if (a17 == 2) {
                    B(offsetForPosition);
                }
            }
        } else if (action == 3) {
            D();
            E();
        }
        return true;
    }

    public final void r() {
        android.text.TextWatcher textWatcher = this.f188123x0;
        removeTextChangedListener(textWatcher);
        addTextChangedListener(textWatcher);
        setMovementMethod(new oz4.j());
        this.N = -1;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.P = paint;
        paint.setColor(1347529272);
        this.R = new nz4.f();
        this.T = new android.graphics.Path();
        this.U = -1;
        this.V = -1;
        this.W = -1;
        if (nz4.y.M) {
            setHighlightColor(0);
            setCustomSelectionActionModeCallback(new mz4.c0(this));
        }
    }

    @Override // android.view.View
    public boolean requestFocus(int i17, android.graphics.Rect rect) {
        return super.requestFocus(i17, rect);
    }

    public void setEditTextType(int i17) {
        this.C = i17;
    }

    public void setIgnoreSelectChangeByMultiSelect(boolean z17) {
        this.S = z17;
    }

    @Override // android.widget.TextView
    public void setMaxHeight(int i17) {
        super.setMaxHeight(i17);
    }

    public void setPosInDataList(int i17) {
        this.N = i17;
    }

    public void setProcessClickListener(lz4.b bVar) {
        this.f188119u = bVar;
    }

    public void setRichTextEditing(java.lang.String str) {
        x();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            setText("");
        } else {
            setSpannableText(kz4.a.a(str));
        }
        C();
    }

    @Override // android.widget.EditText
    public void setSelection(int i17) {
        super.setSelection(i17);
    }

    public void setSpannableText(android.text.Spanned spanned) {
        x();
        synchronized (this) {
            this.f188120v = true;
        }
        super.setText(spanned, android.widget.TextView.BufferType.EDITABLE);
        synchronized (this) {
            this.f188120v = false;
        }
        t();
        oz4.w.b(this, new oz4.v[0]);
        C();
        setContentDescription(qz4.c.l(w(mz4.h0.f333283b), getContext()));
    }

    public void setText(java.lang.String str) {
        x();
        super.setText((java.lang.CharSequence) str);
        C();
        setContentDescription(qz4.c.l(w(mz4.h0.f333283b), getContext()));
    }

    public void setTextWithoutIgnore(java.lang.String str) {
        super.setText((java.lang.CharSequence) str);
    }

    public final void t() {
        android.text.Editable text = getText();
        if (text.getSpans(0, text.length(), getClass()) != null) {
            text.setSpan(this, 0, text.length(), 18);
        }
    }

    public void u(oz4.v vVar, java.lang.Object obj) {
        if (this.H) {
            return;
        }
        android.text.Spannable v17 = this.f188121w ? null : v();
        vVar.a(this, obj);
        synchronized (this) {
            if (this.f188116r != null && !this.f188121w) {
                ((mz4.j0) this.f188116r).h(this, v17, v(), getSelectionStart(), getSelectionEnd(), getSelectionStart(), getSelectionEnd());
            }
            this.I = true;
        }
    }

    public android.text.Spannable v() {
        java.lang.CharSequence text = super.getText();
        if (text == null) {
            text = "";
        }
        return new mz4.a(text);
    }

    public java.lang.String w(mz4.h0 h0Var) {
        return h0Var == mz4.h0.f333282a ? getText().toString() : h0Var == mz4.h0.f333283b ? kz4.c.b(getText()) : "";
    }

    public synchronized void x() {
        this.f188121w = true;
    }

    public void y() {
        lz4.d dVar = this.f188116r;
        if (dVar != null) {
            ((mz4.j0) dVar).j(true, 50L);
            ((mz4.j0) this.f188116r).i(1, 0L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0054 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void z(int r10, boolean r11) {
        /*
            r9 = this;
            lz4.b r0 = r9.f188119u
            if (r0 == 0) goto L17
            sz4.q r0 = (sz4.q) r0
            sz4.r r0 = r0.f414216a
            com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText r0 = r0.f414222f
            if (r0 == 0) goto L10
            r0.z(r10, r11)
            return
        L10:
            java.lang.String r10 = "btnPre"
            kotlin.jvm.internal.o.o(r10)
            r10 = 0
            throw r10
        L17:
            android.text.Editable r0 = r9.getText()
            if (r0 != 0) goto L1e
            return
        L1e:
            android.text.Layout r1 = r9.getLayout()
            if (r1 != 0) goto L25
            return
        L25:
            int r2 = r0.length()
            if (r10 < 0) goto L9a
            if (r10 <= r2) goto L2f
            goto L9a
        L2f:
            r3 = 0
            if (r2 != 0) goto L34
            r10 = r3
            goto L51
        L34:
            if (r10 >= r2) goto L45
            if (r11 != 0) goto L40
            char r11 = r0.charAt(r10)
            r0 = 10
            if (r11 == r0) goto L51
        L40:
            int r11 = r1.getOffsetToRightOf(r10)
            goto L52
        L45:
            if (r10 != r2) goto L51
            if (r11 == 0) goto L51
            int r11 = r1.getOffsetToLeftOf(r10)
            r8 = r11
            r11 = r10
            r10 = r8
            goto L52
        L51:
            r11 = r10
        L52:
            if (r10 < 0) goto L9a
            if (r10 > r2) goto L9a
            if (r11 < 0) goto L9a
            if (r11 <= r2) goto L5b
            goto L9a
        L5b:
            nz4.y r0 = nz4.y.h()
            boolean r1 = nz4.y.M
            r2 = 1
            if (r1 == 0) goto L6a
            boolean r0 = r0.f341643a
            if (r0 == 0) goto L6d
            r0 = r2
            goto L6e
        L6a:
            r0.getClass()
        L6d:
            r0 = r3
        L6e:
            r4 = 50
            if (r0 == 0) goto L90
            r9.requestFocus()
            r9.setIgnoreSelectChangeByMultiSelect(r2)
            r9.setSelection(r10, r11)
            r9.setIgnoreSelectChangeByMultiSelect(r3)
            lz4.d r0 = r9.f188116r
            if (r0 == 0) goto L90
            mz4.j0 r0 = (mz4.j0) r0
            r0.j(r2, r4)
            lz4.d r0 = r9.f188116r
            r6 = 0
            mz4.j0 r0 = (mz4.j0) r0
            r0.i(r2, r6)
        L90:
            r9.F(r10, r11)
            nz4.y r10 = nz4.y.h()
            r10.D(r2, r2, r4)
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText.z(int, boolean):void");
    }

    @Override // android.widget.EditText, android.widget.TextView
    public android.text.Editable getText() {
        return super.getText();
    }

    public WXRTEditText(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f188117s = -1;
        this.f188118t = -1;
        this.f188120v = false;
        this.A = "";
        this.C = 0;
        this.D = false;
        this.H = false;
        this.K = false;
        this.L = 0;
        this.M = false;
        this.N = -1;
        this.P = null;
        this.Q = null;
        this.R = null;
        this.S = false;
        this.T = null;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.f188115p0 = false;
        this.f188123x0 = new mz4.d0(this);
        this.f188125y0 = 0;
        this.f188114l1 = -1;
        r();
    }
}
