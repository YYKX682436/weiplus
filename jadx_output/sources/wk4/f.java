package wk4;

/* loaded from: classes10.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public android.app.Activity f446971a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.ui.tools.f5 f446972b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f446973c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.ting.comment.view.TingCommentFooter f446974d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.FrameLayout f446975e;

    /* renamed from: f, reason: collision with root package name */
    public int f446976f;

    /* renamed from: g, reason: collision with root package name */
    public int f446977g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.FinderCommentInfo f446978h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f446979i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f446980j;

    /* renamed from: k, reason: collision with root package name */
    public yk4.a f446981k;

    /* renamed from: l, reason: collision with root package name */
    public final jz5.g f446982l;

    public f() {
        ((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).getClass();
        this.f446977g = com.tencent.mm.plugin.finder.storage.t70.f127590a.u2();
        this.f446982l = jz5.h.b(new wk4.b(this));
    }

    public static final void a(wk4.f fVar, com.tencent.pigeon.ting.CommentInputRequest commentInputRequest) {
        fVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.TingCommentController", "addCommentInputView");
        android.app.Activity activity = fVar.f446971a;
        if (activity == null) {
            return;
        }
        android.widget.FrameLayout frameLayout = fVar.f446975e;
        if (frameLayout != null) {
            pm0.v.B(frameLayout);
        }
        fVar.f446976f = com.tencent.mm.ui.bl.c(activity);
        android.widget.FrameLayout frameLayout2 = new android.widget.FrameLayout(activity);
        frameLayout2.setBackgroundColor(activity.getResources().getColor(com.tencent.mm.R.color.a9e));
        fVar.f446975e = frameLayout2;
        android.widget.FrameLayout d17 = fVar.d();
        if (d17 != null) {
            android.widget.FrameLayout frameLayout3 = fVar.f446975e;
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            layoutParams.bottomMargin = fVar.f446976f;
            d17.addView(frameLayout3, layoutParams);
        }
        com.tencent.mm.plugin.ting.comment.view.TingCommentFooter tingCommentFooter = (com.tencent.mm.plugin.ting.comment.view.TingCommentFooter) com.tencent.mm.ui.id.b(activity).inflate(com.tencent.mm.R.layout.f489575d11, fVar.f446975e).findViewById(com.tencent.mm.R.id.eat);
        fVar.f446974d = tingCommentFooter;
        if (tingCommentFooter != null) {
            tingCommentFooter.setVisibility(fVar.f446979i ? 0 : 4);
            tingCommentFooter.setBackgroundColor(activity.getResources().getColor(com.tencent.mm.R.color.a9e));
            tingCommentFooter.setAutoHideWithKeyboard(!fVar.f446979i);
            tingCommentFooter.setCommentFooterStateListener((wk4.a) ((jz5.n) fVar.f446982l).getValue());
            tingCommentFooter.setHideExtraTranslationY(0.0f);
            fVar.h(commentInputRequest);
            android.app.Activity activity2 = fVar.f446971a;
            if (activity2 != null) {
                com.tencent.mm.ui.tools.f5 f5Var = fVar.f446972b;
                if (f5Var != null) {
                    f5Var.d();
                }
                fVar.f446972b = null;
                fVar.f446972b = new com.tencent.mm.ui.tools.f5(activity2);
                com.tencent.mm.ui.tools.f5 f5Var2 = fVar.f446972b;
                if (f5Var2 != null) {
                    f5Var2.f210400e = fVar.f446974d;
                }
                com.tencent.mm.ui.tools.f5 f5Var3 = fVar.f446972b;
                if (f5Var3 != null) {
                    f5Var3.f();
                }
            }
        }
        com.tencent.mm.plugin.ting.comment.view.TingCommentFooter tingCommentFooter2 = fVar.f446974d;
        if (tingCommentFooter2 == null) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = tingCommentFooter2.getLayoutParams();
        if (layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams) {
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = fVar.f446976f;
        }
        tingCommentFooter2.setLayoutParams(layoutParams2);
    }

    public static final void b(wk4.f fVar) {
        android.widget.TextView replyBtn;
        com.tencent.mars.xlog.Log.i("MicroMsg.TingCommentController", "hideCommentInputView " + fVar.f());
        if (fVar.f()) {
            fVar.f446973c = false;
            com.tencent.mm.plugin.ting.comment.view.TingCommentFooter tingCommentFooter = fVar.f446974d;
            if (tingCommentFooter != null) {
                int i17 = tingCommentFooter.footerMode;
                if (i17 == 1) {
                    tingCommentFooter.k(true);
                } else if (i17 == 2) {
                    tingCommentFooter.n(false);
                }
            }
        }
        com.tencent.mm.plugin.ting.comment.view.TingCommentFooter tingCommentFooter2 = fVar.f446974d;
        com.tencent.mm.ui.widget.MMEditText editText = tingCommentFooter2 != null ? tingCommentFooter2.getEditText() : null;
        if (editText != null) {
            editText.setText((java.lang.CharSequence) null);
        }
        com.tencent.mm.plugin.ting.comment.view.TingCommentFooter tingCommentFooter3 = fVar.f446974d;
        if (tingCommentFooter3 != null) {
            tingCommentFooter3.h("", "", null);
        }
        com.tencent.mm.plugin.ting.comment.view.TingCommentFooter tingCommentFooter4 = fVar.f446974d;
        if (tingCommentFooter4 != null && (replyBtn = tingCommentFooter4.getReplyBtn()) != null) {
            replyBtn.setText(com.tencent.mm.R.string.jyk);
        }
        fVar.g();
    }

    public static final void c(wk4.f fVar, com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo, boolean z17) {
        android.widget.TextView replyBtn;
        float f174682v;
        int i17;
        com.tencent.mm.plugin.ting.comment.view.TingCommentFooter tingCommentFooter = fVar.f446974d;
        if (tingCommentFooter != null) {
            if (z17) {
                if (fVar.f446979i) {
                    f174682v = tingCommentFooter.getF174682v();
                    i17 = fVar.f446976f;
                } else {
                    f174682v = tingCommentFooter.getF174682v() + tingCommentFooter.getEditLayoutMinHeight();
                    i17 = fVar.f446976f;
                }
                tingCommentFooter.setTranslationY(f174682v + i17);
            }
            if (finderCommentInfo != null) {
                int i18 = fVar.f446977g;
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                hc2.t.b(com.tencent.mm.sdk.platformtools.x2.f193071a, i18);
                java.lang.String username = finderCommentInfo.getUsername();
                java.lang.String nickname = finderCommentInfo.getNickname();
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                java.lang.String Ri = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Ri(username, nickname, false);
                tingCommentFooter.g(tingCommentFooter.lastFromName, " " + tingCommentFooter.getResources().getString(com.tencent.mm.R.string.jyo, Ri), null, true);
            } else {
                tingCommentFooter.h("", "", null);
            }
            boolean z18 = finderCommentInfo != null;
            com.tencent.mm.plugin.ting.comment.view.TingCommentFooter tingCommentFooter2 = fVar.f446974d;
            if (tingCommentFooter2 == null || (replyBtn = tingCommentFooter2.getReplyBtn()) == null) {
                return;
            }
            replyBtn.setText(z18 ? com.tencent.mm.R.string.f490541y0 : com.tencent.mm.R.string.jyk);
        }
    }

    public final android.widget.FrameLayout d() {
        android.view.Window window;
        android.app.Activity activity = this.f446971a;
        if (!(activity instanceof com.tencent.mm.ui.MMActivity)) {
            return null;
        }
        com.tencent.mm.ui.MMActivity mMActivity = activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null;
        android.view.View decorView = (mMActivity == null || (window = mMActivity.getWindow()) == null) ? null : window.getDecorView();
        if (decorView instanceof android.widget.FrameLayout) {
            return (android.widget.FrameLayout) decorView;
        }
        return null;
    }

    public final void e() {
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.TingCommentController", "internalRemoveCommentInputView", new java.lang.Object[0]);
        android.widget.FrameLayout d17 = d();
        if (d17 != null) {
            d17.removeView(this.f446975e);
        }
        this.f446975e = null;
        this.f446974d = null;
    }

    public final boolean f() {
        return (!this.f446973c || this.f446974d == null || this.f446975e == null) ? false : true;
    }

    public final void g() {
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.TingCommentController", "removeCommentInputViewIfNeeded showInputBar: " + this.f446979i, new java.lang.Object[0]);
        if (this.f446979i) {
            return;
        }
        e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005b, code lost:
    
        if (r8.booleanValue() == false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(com.tencent.pigeon.ting.CommentInputRequest r8) {
        /*
            r7 = this;
            com.tencent.mm.plugin.ting.comment.view.TingCommentFooter r0 = r7.f446974d
            if (r0 == 0) goto L70
            java.lang.Long r1 = r8.getUseIdentityType()
            r2 = 1
            if (r1 == 0) goto L44
            java.lang.Long r1 = r8.getUseIdentityType()
            if (r1 != 0) goto L12
            goto L27
        L12:
            long r3 = r1.longValue()
            r5 = 2
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L27
            r1 = 2
            r0.setScene(r1)
            int r1 = r0.getScene()
            r7.f446977g = r1
            goto L49
        L27:
            if (r1 != 0) goto L2a
            goto L3e
        L2a:
            long r3 = r1.longValue()
            r5 = 3
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L3e
            r0.setScene(r2)
            int r1 = r0.getScene()
            r7.f446977g = r1
            goto L49
        L3e:
            int r1 = r7.f446977g
            r0.setScene(r1)
            goto L49
        L44:
            int r1 = r7.f446977g
            r0.setScene(r1)
        L49:
            java.lang.Boolean r1 = r8.getCanSwitch()
            r3 = 0
            if (r1 == 0) goto L5e
            java.lang.Boolean r8 = r8.getCanSwitch()
            kotlin.jvm.internal.o.d(r8)
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L5e
            goto L5f
        L5e:
            r2 = r3
        L5f:
            r0.setBanSwitchScene(r2)
            r0.l(r3)
            r0.m(r3)
            wk4.e r8 = new wk4.e
            r8.<init>(r7)
            r0.setSwitchSceneListener(r8)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wk4.f.h(com.tencent.pigeon.ting.CommentInputRequest):void");
    }
}
