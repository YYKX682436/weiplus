package com.tencent.mm.plugin.sns.cover.preview;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002J\u001c\u0010\u0007\u001a\u00020\u00042\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002J\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\bJ\u0010\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0003J\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001d"}, d2 = {"Lcom/tencent/mm/plugin/sns/cover/preview/SnsCoverFadeImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Lkotlin/Function1;", "Landroid/graphics/Bitmap;", "Ljz5/f0;", "getSourceDecodeCallback", "callback", "setSourceDecodeCallback", "Lv94/i;", "getSnsCoverReporter", "reporter", "setSnsCoverReporter", ya.b.SOURCE, "setImageBitmapWithFade", "", "newMode", "setMode", "Lfe0/e4;", "f", "Lfe0/e4;", "getDelegate", "()Lfe0/e4;", "delegate", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "sns-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SnsCoverFadeImageView extends androidx.appcompat.widget.AppCompatImageView {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final fe0.e4 delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnsCoverFadeImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        aa4.l lVar;
        kotlin.jvm.internal.o.g(context, "context");
        setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        if (((fe0.f4) i95.n0.c(fe0.f4.class)) != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createSnsCoverFadeDelegate", "com.tencent.mm.feature.sns.SnsCoverFadeImageService");
            lVar = new aa4.l(this);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createSnsCoverFadeDelegate", "com.tencent.mm.feature.sns.SnsCoverFadeImageService");
        } else {
            lVar = null;
        }
        this.delegate = lVar;
    }

    public static void r(com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeImageView snsCoverFadeImageView, java.lang.String userName, long j17, java.lang.String str, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 8) != 0) {
            z17 = false;
        }
        snsCoverFadeImageView.getClass();
        kotlin.jvm.internal.o.g(userName, "userName");
        snsCoverFadeImageView.n(userName, j17, str, 0, z17);
    }

    public final fe0.e4 getDelegate() {
        return this.delegate;
    }

    public final v94.i getSnsCoverReporter() {
        fe0.e4 e4Var = this.delegate;
        if (e4Var == null) {
            return null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsCoverReporter", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
        v94.i iVar = ((aa4.l) e4Var).f2667g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsCoverReporter", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
        return iVar;
    }

    public final yz5.l getSourceDecodeCallback() {
        fe0.e4 e4Var = this.delegate;
        if (e4Var == null) {
            return null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSourceDecodeCallback", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
        yz5.l lVar = ((aa4.l) e4Var).f2665e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSourceDecodeCallback", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
        return lVar;
    }

    public final void n(java.lang.String userName, long j17, java.lang.String str, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(userName, "userName");
        fe0.e4 e4Var = this.delegate;
        if (e4Var != null) {
            aa4.l lVar = (aa4.l) e4Var;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setImagePath", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsCoverFadeImageView", "SnsCoverFadeImageView load cover,imagePath:" + str);
            lVar.f2670m = userName;
            lVar.f2671n = j17;
            lVar.f2672o = i17;
            lVar.f2673p = z17;
            if (str != null && r26.i0.y(str, "http", false)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsCoverReporter", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
                v94.i iVar = lVar.f2667g;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsCoverReporter", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
                if (iVar != null) {
                    ((ba4.a) iVar).g(false);
                }
                java.lang.String a17 = com.tencent.mm.plugin.sns.storage.a2.f165920g.a(userName);
                pc4.d dVar = pc4.d.f353410a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableSnsCoverLoadByMars", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
                boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_cover_load_by_mars, true);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableSnsCoverLoadByMars", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
                if (fj6) {
                    java.lang.String str2 = userName + '-' + j17;
                    if (com.tencent.mm.plugin.sns.model.l4.hj().n(a17, str, str2, true, com.tencent.mm.storage.s7.f195307k, "", "") == null) {
                        com.tencent.mm.plugin.sns.model.l4.Cj().c(lVar);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setImagePath", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
                        return;
                    } else {
                        if (!com.tencent.mm.vfs.w6.j(a17)) {
                            lVar.e(str2, a17);
                        }
                        lVar.f(a17, i17, z17);
                    }
                } else {
                    n11.a b17 = n11.a.b();
                    o11.f fVar = new o11.f();
                    fVar.f342082f = a17;
                    fVar.f342078b = true;
                    b17.d(str, fVar.a(), new aa4.i(userName, j17, a17, lVar, i17, z17, str));
                }
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsCoverReporter", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
                v94.i iVar2 = lVar.f2667g;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsCoverReporter", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
                if (iVar2 != null) {
                    ((ba4.a) iVar2).g(true);
                }
                lVar.f(str, i17, z17);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setImagePath", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
        }
    }

    public final void setImageBitmapWithFade(android.graphics.Bitmap bitmap) {
        fe0.e4 e4Var = this.delegate;
        if (e4Var != null) {
            aa4.l lVar = (aa4.l) e4Var;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setImageBitmapWithFade", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
            if (bitmap == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setImageBitmapWithFade", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
                return;
            }
            if ((bitmap.getHeight() * 1.0f) / bitmap.getWidth() < 1.7777778f) {
                aa4.l.b(lVar, bitmap, bitmap.getWidth(), (int) (bitmap.getWidth() * 1.7777778f), 0, false, 24, null);
            } else {
                pm0.v.X(new aa4.h(lVar, bitmap));
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setImageBitmapWithFade", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
        }
    }

    public final void setMode(int i17) {
        fe0.e4 e4Var = this.delegate;
        if (e4Var == null) {
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMode", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
        ((aa4.l) e4Var).f2668h = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMode", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
    }

    public final void setSnsCoverReporter(v94.i iVar) {
        fe0.e4 e4Var = this.delegate;
        if (e4Var == null) {
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsCoverReporter", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
        ((aa4.l) e4Var).f2667g = iVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsCoverReporter", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
    }

    public final void setSourceDecodeCallback(yz5.l lVar) {
        fe0.e4 e4Var = this.delegate;
        if (e4Var == null) {
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSourceDecodeCallback", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
        ((aa4.l) e4Var).f2665e = lVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSourceDecodeCallback", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeDelegate");
    }
}
