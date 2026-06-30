package com.tencent.mm.plugin.multitalk.ui.widget;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\b\u0016B\u0017\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005J\b\u0010\t\u001a\u0004\u0018\u00010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0015\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010!\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\f\u001a\u0004\b\u001f\u0010\u000e\"\u0004\b \u0010\u0010R\"\u0010(\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006/"}, d2 = {"Lcom/tencent/mm/plugin/multitalk/ui/widget/MultitalkFrameView;", "Lcom/tencent/mm/plugin/multitalk/model/a0;", "Landroid/widget/FrameLayout;", "Landroid/widget/ImageView;", "getAvatarIv", "", "getUsername", "getNickName", "Lsj3/b5;", "getCurrentSnapShot", "", "h", "I", "getIndex", "()I", "setIndex", "(I)V", ya.b.INDEX, "i", "getPosition", "setPosition", "position", "Lsj3/c5;", "p", "Lsj3/c5;", "getStatus", "()Lsj3/c5;", "setStatus", "(Lsj3/c5;)V", "status", "s", "getMId", "setMId", "mId", "w", "Lsj3/b5;", "getElementPrev", "()Lsj3/b5;", "setElementPrev", "(Lsj3/b5;)V", "elementPrev", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-multitalk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class MultitalkFrameView extends android.widget.FrameLayout implements com.tencent.mm.plugin.multitalk.model.a0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.RelativeLayout f150338d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.multitalk.mt_render.mt_render_impl.render.VideoView f150339e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f150340f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f150341g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public int index;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public int position;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f150344m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f150345n;

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.Paint f150346o;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public sj3.c5 status;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f150348q;

    /* renamed from: r, reason: collision with root package name */
    public int f150349r;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public int mId;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f150351t;

    /* renamed from: u, reason: collision with root package name */
    public int f150352u;

    /* renamed from: v, reason: collision with root package name */
    public int f150353v;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public sj3.b5 elementPrev;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultitalkFrameView(android.content.Context context, android.util.AttributeSet attr) {
        super(context, attr);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attr, "attr");
        this.f150344m = "";
        this.status = sj3.c5.f408457g;
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        this.f150348q = z65.c.a();
        this.mId = -1;
        this.f150351t = com.tencent.mm.plugin.multitalk.model.e3.Ri().v();
        this.f150352u = getMeasuredWidth();
        this.f150353v = getMeasuredHeight();
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.MultitalkFrameView", "MultitalkFrameView init " + hashCode(), new java.lang.Object[0]);
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.c38, this);
        this.f150338d = (android.widget.RelativeLayout) getRootView().findViewById(com.tencent.mm.R.id.jwa);
        this.f150339e = (com.tencent.mm.plugin.multitalk.mt_render.mt_render_impl.render.VideoView) getRootView().findViewById(com.tencent.mm.R.id.f485057ge1);
        this.f150341g = (android.widget.ImageView) getRootView().findViewById(com.tencent.mm.R.id.gdh);
        this.f150340f = (android.widget.TextView) getRootView().findViewById(com.tencent.mm.R.id.f484030cr4);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f150346o = paint;
        paint.setColor(-16777216);
        paint.setFilterBitmap(false);
        paint.setTextSize(40.0f);
        this.elementPrev = new sj3.b5();
    }

    @Override // com.tencent.mm.plugin.multitalk.model.a0
    public void a(java.lang.String userName, android.graphics.Bitmap bm6, int i17, int i18) {
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(bm6, "bm");
        ((ku5.t0) ku5.t0.f312615d).B(new sj3.d5(this, bm6, i17, i18));
    }

    @Override // com.tencent.mm.plugin.multitalk.model.a0
    public void b() {
        if (this.status == sj3.c5.f408454d) {
            android.widget.ImageView imageView = this.f150341g;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            com.tencent.mm.plugin.multitalk.mt_render.mt_render_impl.render.VideoView videoView = this.f150339e;
            if (videoView == null) {
                return;
            }
            videoView.setVisibility(8);
        }
    }

    public final void c() {
        com.tencent.mm.plugin.multitalk.model.a2 n17;
        if (com.tencent.mm.sdk.platformtools.t8.K0(getF150344m())) {
            return;
        }
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.MultitalkFrameView", "changeToAvatar %s from %s", getF150344m(), this.status.name());
        this.status = sj3.c5.f408454d;
        k();
        com.tencent.mm.plugin.multitalk.mt_render.mt_render_impl.render.VideoView videoView = this.f150339e;
        if (videoView == null || (n17 = com.tencent.mm.plugin.multitalk.model.e3.Ri().n()) == null) {
            return;
        }
        n17.l(videoView, this.f150344m);
    }

    public final void d() {
        com.tencent.mm.plugin.multitalk.model.a2 n17;
        com.tencent.mars.xlog.Log.i("MicroMsg.MultitalkFrameView", "changeToNone %s from %s", getF150344m(), this.status.name());
        com.tencent.mm.plugin.multitalk.mt_render.mt_render_impl.render.VideoView videoView = this.f150339e;
        if (videoView != null && (n17 = com.tencent.mm.plugin.multitalk.model.e3.Ri().n()) != null) {
            n17.l(videoView, this.f150344m);
        }
        this.status = sj3.c5.f408457g;
        g("", -1);
    }

    public final void e() {
        com.tencent.mm.plugin.multitalk.model.a2 n17;
        this.status = sj3.c5.f408456f;
        this.elementPrev.f408444a = null;
        com.tencent.mm.plugin.multitalk.mt_render.mt_render_impl.render.VideoView videoView = this.f150339e;
        if (videoView != null && (n17 = com.tencent.mm.plugin.multitalk.model.e3.Ri().n()) != null) {
            n17.a(videoView, this.f150344m);
        }
        android.widget.ImageView imageView = this.f150341g;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        if (videoView == null) {
            return;
        }
        videoView.setVisibility(0);
    }

    public final void f() {
        com.tencent.mm.plugin.multitalk.model.a2 n17;
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.MultitalkFrameView", "changeToVideo %s from %s", getF150344m(), this.status.name());
        this.status = sj3.c5.f408455e;
        h(this.elementPrev);
        com.tencent.mm.plugin.multitalk.mt_render.mt_render_impl.render.VideoView videoView = this.f150339e;
        if (videoView != null && (n17 = com.tencent.mm.plugin.multitalk.model.e3.Ri().n()) != null) {
            n17.a(videoView, this.f150344m);
        }
        android.widget.ImageView imageView = this.f150341g;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        if (videoView == null) {
            return;
        }
        videoView.setVisibility(0);
    }

    public final void g(java.lang.String username, int i17) {
        kotlin.jvm.internal.o.g(username, "username");
        com.tencent.mars.xlog.Log.i("MicroMsg.MultitalkFrameView", "changeUser from %s to %s", this.f150344m, username);
        this.f150344m = username;
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(username, true);
        if (n17 != null) {
            this.f150345n = n17.f2();
        } else {
            this.f150345n = username;
        }
        this.mId = i17;
        android.widget.RelativeLayout relativeLayout = this.f150338d;
        if (relativeLayout != null) {
            relativeLayout.setTag(com.tencent.mm.R.id.nwv, this.f150345n);
        }
    }

    @Override // com.tencent.mm.plugin.multitalk.model.a0
    /* renamed from: getAvatarIv, reason: from getter */
    public android.widget.ImageView getF150341g() {
        return this.f150341g;
    }

    /* renamed from: getCurrentSnapShot, reason: from getter */
    public final sj3.b5 getElementPrev() {
        return this.elementPrev;
    }

    public final sj3.b5 getElementPrev() {
        return this.elementPrev;
    }

    public final int getIndex() {
        return this.index;
    }

    public final int getMId() {
        return this.mId;
    }

    /* renamed from: getNickName, reason: from getter */
    public final java.lang.String getF150345n() {
        return this.f150345n;
    }

    public final int getPosition() {
        return this.position;
    }

    public final sj3.c5 getStatus() {
        return this.status;
    }

    @Override // com.tencent.mm.plugin.multitalk.model.a0
    /* renamed from: getUsername, reason: from getter */
    public java.lang.String getF150344m() {
        return this.f150344m;
    }

    public final void h(sj3.b5 b5Var) {
        if ((b5Var != null ? b5Var.f408444a : null) != null) {
            android.graphics.Bitmap bitmap = b5Var.f408444a;
            kotlin.jvm.internal.o.d(bitmap);
            if (bitmap.isRecycled()) {
                return;
            }
            java.lang.String str = this.f150344m;
            if (str == null) {
                str = "";
            }
            android.graphics.Bitmap bitmap2 = b5Var.f408444a;
            kotlin.jvm.internal.o.d(bitmap2);
            a(str, bitmap2, 0, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Matrix i(int r6, int r7, int r8, int r9, int r10, int r11) {
        /*
            r5 = this;
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            int r1 = com.tencent.mm.plugin.voip.video.OpenGlRender.A
            r1 = 12
            r2 = 1073741824(0x40000000, float:2.0)
            if (r10 == r1) goto L2f
            r1 = 270(0x10e, float:3.78E-43)
            if (r10 != r1) goto L12
            goto L2f
        L12:
            r1 = 4
            if (r10 == r1) goto L19
            r1 = 90
            if (r10 != r1) goto L47
        L19:
            int r10 = -r8
            float r10 = (float) r10
            float r10 = r10 / r2
            int r1 = -r9
            float r1 = (float) r1
            float r1 = r1 / r2
            r0.postTranslate(r10, r1)
            r10 = 1119092736(0x42b40000, float:90.0)
            r0.postRotate(r10)
            float r10 = (float) r9
            float r10 = r10 / r2
            float r1 = (float) r8
            float r1 = r1 / r2
            r0.postTranslate(r10, r1)
            goto L44
        L2f:
            int r10 = -r8
            float r10 = (float) r10
            float r10 = r10 / r2
            int r1 = -r9
            float r1 = (float) r1
            float r1 = r1 / r2
            r0.postTranslate(r10, r1)
            r10 = 1132920832(0x43870000, float:270.0)
            r0.postRotate(r10)
            float r10 = (float) r9
            float r10 = r10 / r2
            float r1 = (float) r8
            float r1 = r1 / r2
            r0.postTranslate(r10, r1)
        L44:
            r4 = r9
            r9 = r8
            r8 = r4
        L47:
            r10 = 16
            r1 = 0
            if (r11 != r10) goto L57
            r10 = -1082130432(0xffffffffbf800000, float:-1.0)
            r11 = 1065353216(0x3f800000, float:1.0)
            r0.postScale(r10, r11)
            float r10 = (float) r8
            r0.postTranslate(r10, r1)
        L57:
            float r7 = (float) r7
            float r6 = (float) r6
            float r10 = r7 / r6
            float r9 = (float) r9
            float r8 = (float) r8
            float r11 = r9 / r8
            int r3 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r3 >= 0) goto L6e
            float r7 = r7 / r9
            r0.postScale(r7, r7)
            float r7 = r7 * r8
            float r6 = r6 - r7
            float r6 = r6 / r2
            r0.postTranslate(r6, r1)
            goto L82
        L6e:
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto L7d
            float r6 = r6 / r8
            r0.postScale(r6, r6)
            float r6 = r6 * r9
            float r7 = r7 - r6
            float r7 = r7 / r2
            r0.postTranslate(r1, r7)
            goto L82
        L7d:
            float r6 = r6 / r8
            float r7 = r7 / r9
            r0.postScale(r6, r7)
        L82:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView.i(int, int, int, int, int, int):android.graphics.Matrix");
    }

    public final boolean j() {
        return this.status == sj3.c5.f408456f;
    }

    public final void k() {
        if (this.status == sj3.c5.f408454d) {
            com.tencent.mm.plugin.multitalk.model.e3.Ri().q().getClass();
            android.widget.ImageView f150341g = getF150341g();
            if (f150341g != null) {
                ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.multitalk.model.i3(f150341g, this));
            }
        }
    }

    public final void setElementPrev(sj3.b5 b5Var) {
        kotlin.jvm.internal.o.g(b5Var, "<set-?>");
        this.elementPrev = b5Var;
    }

    public final void setIndex(int i17) {
        this.index = i17;
    }

    public final void setMId(int i17) {
        this.mId = i17;
    }

    public final void setPosition(int i17) {
        this.position = i17;
    }

    public final void setStatus(sj3.c5 c5Var) {
        kotlin.jvm.internal.o.g(c5Var, "<set-?>");
        this.status = c5Var;
    }
}
