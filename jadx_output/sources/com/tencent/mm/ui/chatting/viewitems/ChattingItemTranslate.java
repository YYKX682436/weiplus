package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes5.dex */
public class ChattingItemTranslate extends com.tencent.mm.ui.anim.content.AnimSizeRelativeLayout {

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMNeat7extView f203209e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f203210f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ProgressBar f203211g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f203212h;

    /* renamed from: i, reason: collision with root package name */
    public int f203213i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f203214m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f203215n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.ref.WeakReference f203216o;

    /* renamed from: p, reason: collision with root package name */
    public long f203217p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.neattextview.textview.view.f f203218q;

    /* renamed from: r, reason: collision with root package name */
    public final android.text.SpannableStringBuilder f203219r;

    /* renamed from: s, reason: collision with root package name */
    public final int f203220s;

    /* renamed from: t, reason: collision with root package name */
    public final android.text.style.CharacterStyle f203221t;

    /* renamed from: u, reason: collision with root package name */
    public final android.view.GestureDetector f203222u;

    public ChattingItemTranslate(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f203213i = 0;
        this.f203214m = false;
        this.f203215n = null;
        this.f203216o = null;
        this.f203217p = 0L;
        this.f203219r = new android.text.SpannableStringBuilder();
        this.f203220s = 3;
        this.f203221t = new android.text.style.ForegroundColorSpan(-5066062);
        this.f203222u = new android.view.GestureDetector(getContext(), new com.tencent.mm.ui.chatting.viewitems.fo(this));
    }

    public static void a(com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate chattingItemTranslate) {
        com.tencent.mm.ui.chatting.viewitems.go goVar;
        if (chattingItemTranslate.getContentView() == null || (goVar = (com.tencent.mm.ui.chatting.viewitems.go) chattingItemTranslate.getContentView().getTag()) == null) {
            return;
        }
        int d17 = goVar.d();
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemTranslate", "scrollToVisibility!! position:%s", java.lang.Integer.valueOf(d17));
        android.view.View P0 = ((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) ((yb5.d) chattingItemTranslate.f203216o.get()).f460708c.a(sb5.z.class))).P0(d17);
        if (P0 == null || P0.getTop() <= 0) {
            return;
        }
        yb5.d dVar = (yb5.d) chattingItemTranslate.f203216o.get();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(d17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(dVar, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemTranslate", "scrollToVisibility", "()V", "Undefined", "scrollToPosition", "(I)V");
        dVar.O(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(dVar, "com/tencent/mm/ui/chatting/viewitems/ChattingItemTranslate", "scrollToVisibility", "()V", "Undefined", "scrollToPosition", "(I)V");
    }

    private boolean getNewAnimationConfig() {
        return true;
    }

    public final void b(java.lang.CharSequence charSequence, int i17, long j17, boolean z17) {
        if (i17 <= this.f203213i && !getNewAnimationConfig()) {
            this.f203213i = i17 - 2;
        }
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = java.lang.Integer.valueOf(this.f203209e.hashCode());
        objArr[1] = java.lang.Long.valueOf(j17);
        objArr[2] = charSequence != null ? com.tencent.mm.sdk.platformtools.t8.G1(charSequence.toString()) : "null";
        objArr[3] = java.lang.Integer.valueOf(i17);
        objArr[4] = java.lang.Integer.valueOf(this.f203213i);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemTranslate", "doVoiceTextAnimation(%s) %s %s %s %s", objArr);
        com.tencent.mm.sdk.platformtools.b4 b4Var = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.ui.chatting.viewitems.co(this, charSequence, j17, i17), true);
        this.f203215n = b4Var;
        b4Var.c(0L, getNewAnimationConfig() ? 150L : 200L);
    }

    public void c() {
        this.f203209e = (com.tencent.mm.ui.widget.MMNeat7extView) findViewById(com.tencent.mm.R.id.brv);
        this.f203211g = (android.widget.ProgressBar) findViewById(com.tencent.mm.R.id.brw);
        this.f203210f = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.brt);
        this.f203212h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.brs);
        getSizeAnimController().f361127c = false;
    }

    public void d() {
        getSizeAnimController().f361127c = false;
        qa5.l sizeAnimController = getSizeAnimController();
        sizeAnimController.f361129e = false;
        sizeAnimController.f361132h = -1;
        sizeAnimController.f361133i = null;
        android.animation.ValueAnimator valueAnimator = sizeAnimController.f361134j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        sizeAnimController.f361134j = null;
    }

    public void e(java.lang.CharSequence charSequence, com.tencent.mm.ui.chatting.viewitems.io ioVar, long j17) {
        f(charSequence, ioVar, false, com.tencent.mm.ui.chatting.viewitems.ho.Text, j17, null);
    }

    public void f(java.lang.CharSequence charSequence, com.tencent.mm.ui.chatting.viewitems.io ioVar, boolean z17, com.tencent.mm.ui.chatting.viewitems.ho hoVar, long j17, yb5.d dVar) {
        int i17;
        int length;
        int i18;
        boolean J0 = com.tencent.mm.sdk.platformtools.t8.J0(charSequence);
        com.tencent.mm.ui.chatting.viewitems.io ioVar2 = com.tencent.mm.ui.chatting.viewitems.io.Transforming;
        if (J0) {
            if (ioVar != com.tencent.mm.ui.chatting.viewitems.io.NoTransform) {
                d();
                go.d dVar2 = go.d.f273696a;
                if ((!go.d.f273698c.containsKey(java.lang.Long.valueOf(j17))) & (j17 != go.d.f273704i)) {
                    this.f203211g.setVisibility(0);
                }
                this.f203211g.setEnabled(true);
                this.f203209e.setVisibility(8);
                g(false);
                if (ioVar != ioVar2) {
                    setVisibility(8);
                    return;
                }
                return;
            }
            return;
        }
        if (dVar != null) {
            this.f203216o = new java.lang.ref.WeakReference(dVar);
        }
        this.f203209e.setMaxWidth(((int) (com.tencent.mm.ui.chatting.w5.h(com.tencent.mm.sdk.platformtools.x2.f193071a) / j65.f.f297943g)) - i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 5));
        this.f203209e.setVisibility(0);
        this.f203211g.setVisibility(8);
        com.tencent.mm.ui.chatting.viewitems.ho hoVar2 = com.tencent.mm.ui.chatting.viewitems.ho.Voice;
        com.tencent.mm.ui.chatting.viewitems.io ioVar3 = com.tencent.mm.ui.chatting.viewitems.io.Transformed;
        if (hoVar == hoVar2) {
            if (getNewAnimationConfig()) {
                getSizeAnimController().f361127c = true;
                getSizeAnimController().f361130f = 125;
                getSizeAnimController().f361131g = true;
            }
            g(false);
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemTranslate", "setContent(%s) msgId:%s currentMsgId:%s content:%s status:%s canAnimation:%s currentContentLength:%s", java.lang.Integer.valueOf(this.f203209e.hashCode()), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(this.f203217p), com.tencent.mm.sdk.platformtools.t8.G1(charSequence.toString()), ioVar, java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(this.f203213i));
            if (this.f203217p != j17) {
                this.f203209e.b("");
                this.f203213i = 0;
                com.tencent.mm.sdk.platformtools.b4 b4Var = this.f203215n;
                if (b4Var != null) {
                    b4Var.d();
                }
                this.f203215n = null;
                this.f203214m = false;
            }
            this.f203217p = j17;
            if (z17) {
                this.f203209e.b("");
                this.f203213i = 0;
                com.tencent.mm.sdk.platformtools.b4 b4Var2 = this.f203215n;
                if (b4Var2 != null) {
                    b4Var2.d();
                }
                this.f203215n = null;
                this.f203214m = true;
            }
            if (ioVar == ioVar3 && z17) {
                com.tencent.mm.sdk.platformtools.b4 b4Var3 = this.f203215n;
                if (b4Var3 != null) {
                    b4Var3.d();
                }
                i17 = 0;
                b(charSequence, charSequence.length(), j17, true);
                this.f203214m = false;
            } else {
                i17 = 0;
                if (ioVar == ioVar2 || z17) {
                    com.tencent.mm.sdk.platformtools.b4 b4Var4 = this.f203215n;
                    if (b4Var4 != null) {
                        b4Var4.d();
                    }
                    if (getNewAnimationConfig()) {
                        b(charSequence, charSequence.length(), j17, true);
                    } else if (charSequence.length() > 3) {
                        b(charSequence, charSequence.length() - 3, j17, false);
                    } else {
                        this.f203209e.c(charSequence, android.widget.TextView.BufferType.SPANNABLE, null);
                    }
                } else if (ioVar != ioVar3 || this.f203215n == null) {
                    d();
                    this.f203209e.c(charSequence, android.widget.TextView.BufferType.SPANNABLE, null);
                } else if (this.f203213i == charSequence.length()) {
                    if (!this.f203209e.a().toString().equals(charSequence.toString())) {
                        this.f203209e.c(charSequence, android.widget.TextView.BufferType.SPANNABLE, null);
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemTranslate", "no need update content");
                } else if (this.f203214m) {
                    com.tencent.mm.sdk.platformtools.b4 b4Var5 = this.f203215n;
                    if (b4Var5 != null) {
                        b4Var5.d();
                    }
                    b(charSequence, charSequence.length(), j17, false);
                    this.f203214m = false;
                }
            }
        } else {
            i17 = 0;
            if (ioVar == ioVar2) {
                android.text.SpannableStringBuilder spannableStringBuilder = this.f203219r;
                spannableStringBuilder.clear();
                com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = this.f203209e;
                if (charSequence != null && charSequence.length() != 0) {
                    int length2 = charSequence.length();
                    int i19 = this.f203220s;
                    if (length2 < i19) {
                        length = charSequence.length();
                        i18 = 0;
                    } else {
                        length = charSequence.length();
                        i18 = length - i19;
                    }
                    spannableStringBuilder.append(charSequence).setSpan(this.f203221t, i18, length, 33);
                }
                mMNeat7extView.c(spannableStringBuilder, android.widget.TextView.BufferType.SPANNABLE, null);
            } else {
                this.f203209e.c(charSequence, android.widget.TextView.BufferType.SPANNABLE, null);
            }
            if (ioVar == ioVar3) {
                g(true);
            } else {
                g(false);
            }
        }
        setVisibility(i17);
    }

    public final void g(boolean z17) {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (context == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemTranslate", "showVoiceTransformFinishIcon: %s --%s", java.lang.Boolean.valueOf(z17), new com.tencent.mm.sdk.platformtools.z3());
        if (z17) {
            this.f203209e.setPadding(i65.a.b(context, 10), i65.a.b(context, 8), i65.a.b(context, 10), i65.a.b(context, 4));
            this.f203210f.setVisibility(0);
        } else {
            this.f203209e.setPadding(i65.a.b(context, 10), i65.a.b(context, 8), i65.a.b(context, 10), i65.a.b(context, 8));
            this.f203210f.setVisibility(8);
        }
    }

    public com.tencent.mm.ui.widget.MMNeat7extView getContentView() {
        return this.f203209e;
    }

    public com.tencent.mm.pluginsdk.ui.span.y getTouchListener() {
        return null;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        android.view.GestureDetector gestureDetector;
        motionEvent.getAction();
        boolean z17 = false;
        if (this.f203218q != null && (gestureDetector = this.f203222u) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(motionEvent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(gestureDetector, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemTranslate", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            z17 = gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0));
            yj0.a.g(gestureDetector, z17, "com/tencent/mm/ui/chatting/viewitems/ChattingItemTranslate", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        }
        return !z17 ? super.onTouchEvent(motionEvent) : z17;
    }

    public void setBrandWording(java.lang.String str) {
        this.f203212h.setText(str);
    }

    public void setOnDoubleClickListener(com.tencent.neattextview.textview.view.f fVar) {
        this.f203218q = fVar;
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        super.setVisibility(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemTranslate", "ChattingItemTranslate setVisibility:%s currentMsg:%s -- %s", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(this.f203217p), new com.tencent.mm.sdk.platformtools.z3());
        if (i17 == 8) {
            this.f203211g.setVisibility(8);
        }
    }
}
