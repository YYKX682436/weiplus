package ux2;

/* loaded from: classes5.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ux2.f f431847d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ux2.f fVar) {
        super(0);
        this.f431847d = fVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.Bitmap bitmap;
        android.view.View view;
        ux2.f fVar = this.f431847d;
        yw2.t tVar = (yw2.t) fVar.f431853c;
        yw2.a0 a0Var = tVar.f466670a;
        if (a0Var.k().getShowFooter() && !a0Var.k().getCloseComment()) {
            boolean z17 = fVar.f431856f;
            android.content.Context context = fVar.f431851a;
            if (!z17 && !z17) {
                fVar.f431856f = true;
                android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.f488789e65, null);
                kotlin.jvm.internal.o.f(inflate, "inflate(...)");
                fVar.f431859i = inflate;
                com.tencent.mm.plugin.finder.report.d2.f124994a.n(inflate, "you_might_want_to_send_picture", (r20 & 4) != 0 ? 40 : 0, (r20 & 8) != 0 ? 25496 : 0, (r20 & 16) != 0 ? false : false, (r20 & 32) != 0 ? false : false, (r20 & 64) != 0 ? null : kz5.b1.e(new jz5.l("feed_id", pm0.v.u(((java.lang.Number) fVar.f431855e.invoke()).longValue()))), (r20 & 128) != 0 ? null : null);
                android.view.View view2 = fVar.f431859i;
                if (view2 == null) {
                    kotlin.jvm.internal.o.o("contentView");
                    throw null;
                }
                android.view.View findViewById = view2.findViewById(com.tencent.mm.R.id.f486536ux0);
                fVar.f431860j = findViewById;
                if (findViewById != null) {
                    android.content.Context context2 = fVar.f431851a;
                    findViewById.setBackground(new ux2.g(context2, b3.l.getColor(context2, com.tencent.mm.ui.bk.C() ? com.tencent.mm.R.color.f478517z : com.tencent.mm.R.color.f478491c), context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479672c9), 0.0f, 4.0f, b3.l.getColor(context, com.tencent.mm.R.color.UN_BW_0_Alpha_0_2), ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127700fe).getValue()).r()).floatValue()));
                }
                android.view.View view3 = fVar.f431859i;
                if (view3 == null) {
                    kotlin.jvm.internal.o.o("contentView");
                    throw null;
                }
                fVar.f431861k = (android.widget.ImageView) view3.findViewById(com.tencent.mm.R.id.llu);
                android.view.View view4 = fVar.f431859i;
                if (view4 == null) {
                    kotlin.jvm.internal.o.o("contentView");
                    throw null;
                }
                android.view.View view5 = fVar.f431859i;
                if (view5 == null) {
                    kotlin.jvm.internal.o.o("contentView");
                    throw null;
                }
                db5.d5 d5Var = new db5.d5(view5, context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.amf), -2, false);
                fVar.f431863m = d5Var;
                d5Var.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
                db5.d5 d5Var2 = fVar.f431863m;
                if (d5Var2 == null) {
                    kotlin.jvm.internal.o.o("bubble");
                    throw null;
                }
                d5Var2.setOutsideTouchable(true);
                android.view.View view6 = fVar.f431859i;
                if (view6 == null) {
                    kotlin.jvm.internal.o.o("contentView");
                    throw null;
                }
                view6.setOnClickListener(new ux2.e(fVar));
            }
            android.widget.ImageView imageView = fVar.f431861k;
            if (imageView != null && fVar.f431858h != null && (bitmap = fVar.f431862l) != null && (view = fVar.f431852b) != null) {
                imageView.setImageBitmap(bitmap);
                yw2.a0 a0Var2 = tVar.f466670a;
                int height = ((a0Var2.k().getHeight() - pm0.v.r(a0Var2.n()).top) - i65.a.h(a0Var2.l(), com.tencent.mm.R.dimen.f479671c8)) - i65.a.h(context, com.tencent.mm.R.dimen.f479648bn);
                if (context instanceof android.app.Activity) {
                    android.app.Activity activity = (android.app.Activity) context;
                    if (!activity.isFinishing() && !activity.isDestroyed()) {
                        try {
                            db5.d5 d5Var3 = fVar.f431863m;
                            if (d5Var3 == null) {
                                kotlin.jvm.internal.o.o("bubble");
                                throw null;
                            }
                            if (height < 0) {
                                height = 0;
                            }
                            d5Var3.showAtLocation(view, 85, 0, height);
                        } catch (java.lang.NullPointerException e17) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("FinderCommentRecentImageBubble", e17, "", new java.lang.Object[0]);
                        }
                    }
                }
                pm0.v.U(com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT, fVar.f431864n);
            }
        } else {
            com.tencent.mars.xlog.Log.w("FinderCommentRecentImageBubble", "isSupportRecentImageHelper is false");
        }
        return jz5.f0.f302826a;
    }
}
