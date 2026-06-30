package qm1;

/* loaded from: classes10.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public android.app.Activity f364693a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.ui.tools.f5 f364694b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f364695c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.audio.comment.view.BizCommentFooter f364696d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.FrameLayout f364697e;

    /* renamed from: f, reason: collision with root package name */
    public int f364698f;

    /* renamed from: g, reason: collision with root package name */
    public int f364699g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.FinderCommentInfo f364700h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f364701i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f364702j;

    /* renamed from: k, reason: collision with root package name */
    public sm1.a f364703k;

    /* renamed from: l, reason: collision with root package name */
    public final jz5.g f364704l;

    public f() {
        ((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).getClass();
        this.f364699g = com.tencent.mm.plugin.finder.storage.t70.f127590a.u2();
        this.f364704l = jz5.h.b(new qm1.b(this));
    }

    public static final void a(qm1.f fVar, com.tencent.pigeon.ting.CommentInputRequest commentInputRequest) {
        fVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.BizCommentController", "addCommentInputView");
        android.app.Activity activity = fVar.f364693a;
        if (activity == null) {
            return;
        }
        fVar.f364698f = com.tencent.mm.ui.bl.c(activity);
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(activity);
        frameLayout.setBackgroundColor(activity.getResources().getColor(com.tencent.mm.R.color.a9e));
        fVar.f364697e = frameLayout;
        android.widget.FrameLayout d17 = fVar.d();
        if (d17 != null) {
            android.widget.FrameLayout frameLayout2 = fVar.f364697e;
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            layoutParams.bottomMargin = fVar.f364698f;
            d17.addView(frameLayout2, layoutParams);
        }
        com.tencent.mm.plugin.audio.comment.view.BizCommentFooter bizCommentFooter = (com.tencent.mm.plugin.audio.comment.view.BizCommentFooter) com.tencent.mm.ui.id.b(activity).inflate(com.tencent.mm.R.layout.dza, fVar.f364697e).findViewById(com.tencent.mm.R.id.eat);
        fVar.f364696d = bizCommentFooter;
        if (bizCommentFooter != null) {
            bizCommentFooter.setVisibility(fVar.f364701i ? 0 : 4);
            bizCommentFooter.setBackgroundColor(activity.getResources().getColor(com.tencent.mm.R.color.a9e));
            bizCommentFooter.setAutoHideWithKeyboard(!fVar.f364701i);
            bizCommentFooter.setCommentFooterStateListener((qm1.a) ((jz5.n) fVar.f364704l).getValue());
            bizCommentFooter.setHideExtraTranslationY(0.0f);
            fVar.h(commentInputRequest);
            android.app.Activity activity2 = fVar.f364693a;
            if (activity2 != null) {
                com.tencent.mm.ui.tools.f5 f5Var = fVar.f364694b;
                if (f5Var != null) {
                    f5Var.d();
                }
                fVar.f364694b = null;
                fVar.f364694b = new com.tencent.mm.ui.tools.f5(activity2);
                com.tencent.mm.ui.tools.f5 f5Var2 = fVar.f364694b;
                if (f5Var2 != null) {
                    f5Var2.f210400e = fVar.f364696d;
                }
                com.tencent.mm.ui.tools.f5 f5Var3 = fVar.f364694b;
                if (f5Var3 != null) {
                    f5Var3.f();
                }
            }
        }
        com.tencent.mm.plugin.audio.comment.view.BizCommentFooter bizCommentFooter2 = fVar.f364696d;
        if (bizCommentFooter2 == null) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = bizCommentFooter2.getLayoutParams();
        if (layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams) {
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = fVar.f364698f;
        }
        bizCommentFooter2.setLayoutParams(layoutParams2);
    }

    public static final void b(qm1.f fVar) {
        android.widget.TextView replyBtn;
        com.tencent.mars.xlog.Log.i("MicroMsg.BizCommentController", "hideCommentInputView " + fVar.f());
        if (fVar.f()) {
            fVar.f364695c = false;
            com.tencent.mm.plugin.audio.comment.view.BizCommentFooter bizCommentFooter = fVar.f364696d;
            if (bizCommentFooter != null) {
                int i17 = bizCommentFooter.footerMode;
                if (i17 == 1) {
                    bizCommentFooter.k(true);
                } else if (i17 == 2) {
                    bizCommentFooter.n(false);
                }
            }
        }
        com.tencent.mm.plugin.audio.comment.view.BizCommentFooter bizCommentFooter2 = fVar.f364696d;
        com.tencent.mm.ui.widget.MMEditText editText = bizCommentFooter2 != null ? bizCommentFooter2.getEditText() : null;
        if (editText != null) {
            editText.setText((java.lang.CharSequence) null);
        }
        com.tencent.mm.plugin.audio.comment.view.BizCommentFooter bizCommentFooter3 = fVar.f364696d;
        if (bizCommentFooter3 != null) {
            bizCommentFooter3.h("", "", null);
        }
        com.tencent.mm.plugin.audio.comment.view.BizCommentFooter bizCommentFooter4 = fVar.f364696d;
        if (bizCommentFooter4 != null && (replyBtn = bizCommentFooter4.getReplyBtn()) != null) {
            replyBtn.setText(com.tencent.mm.R.string.n4p);
        }
        fVar.g();
    }

    public static final void c(qm1.f fVar, com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo, boolean z17) {
        android.widget.TextView replyBtn;
        float f92486v;
        int i17;
        com.tencent.mm.plugin.audio.comment.view.BizCommentFooter bizCommentFooter = fVar.f364696d;
        if (bizCommentFooter != null) {
            if (z17) {
                if (fVar.f364701i) {
                    f92486v = bizCommentFooter.getF92486v();
                    i17 = fVar.f364698f;
                } else {
                    f92486v = bizCommentFooter.getF92486v() + bizCommentFooter.getEditLayoutMinHeight();
                    i17 = fVar.f364698f;
                }
                bizCommentFooter.setTranslationY(f92486v + i17);
            }
            if (finderCommentInfo != null) {
                int i18 = fVar.f364699g;
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                hc2.t.b(com.tencent.mm.sdk.platformtools.x2.f193071a, i18);
                java.lang.String username = finderCommentInfo.getUsername();
                java.lang.String nickname = finderCommentInfo.getNickname();
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                java.lang.String Ri = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Ri(username, nickname, false);
                bizCommentFooter.g(bizCommentFooter.lastFromName, " " + bizCommentFooter.getResources().getString(com.tencent.mm.R.string.n4r, Ri), null, true);
            } else {
                bizCommentFooter.h("", "", null);
            }
            boolean z18 = finderCommentInfo != null;
            com.tencent.mm.plugin.audio.comment.view.BizCommentFooter bizCommentFooter2 = fVar.f364696d;
            if (bizCommentFooter2 == null || (replyBtn = bizCommentFooter2.getReplyBtn()) == null) {
                return;
            }
            replyBtn.setText(z18 ? com.tencent.mm.R.string.f490541y0 : com.tencent.mm.R.string.n4p);
        }
    }

    public final android.widget.FrameLayout d() {
        android.view.Window window;
        android.app.Activity activity = this.f364693a;
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
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.BizCommentController", "internalRemoveCommentInputView", new java.lang.Object[0]);
        android.widget.FrameLayout d17 = d();
        if (d17 != null) {
            d17.removeView(this.f364697e);
        }
        this.f364697e = null;
        this.f364696d = null;
    }

    public final boolean f() {
        return (!this.f364695c || this.f364696d == null || this.f364697e == null) ? false : true;
    }

    public final void g() {
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.BizCommentController", "removeCommentInputViewIfNeeded", new java.lang.Object[0]);
        if (this.f364701i) {
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
            com.tencent.mm.plugin.audio.comment.view.BizCommentFooter r0 = r7.f364696d
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
            r7.f364699g = r1
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
            r7.f364699g = r1
            goto L49
        L3e:
            int r1 = r7.f364699g
            r0.setScene(r1)
            goto L49
        L44:
            int r1 = r7.f364699g
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
            qm1.e r8 = new qm1.e
            r8.<init>(r7)
            r0.setSwitchSceneListener(r8)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qm1.f.h(com.tencent.pigeon.ting.CommentInputRequest):void");
    }
}
