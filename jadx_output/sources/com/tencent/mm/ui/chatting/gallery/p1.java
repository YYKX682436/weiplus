package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes12.dex */
public class p1 implements com.tencent.mm.pluginsdk.model.app.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.q1 f201259a;

    public p1(com.tencent.mm.ui.chatting.gallery.q1 q1Var) {
        this.f201259a = q1Var;
    }

    @Override // com.tencent.mm.pluginsdk.model.app.r0
    public void S(long j17, long j18, com.tencent.mm.modelbase.m1 m1Var) {
        android.graphics.Bitmap Ai;
        if (j17 == j18) {
            com.tencent.mm.ui.chatting.gallery.q1 q1Var = this.f201259a;
            q1Var.f201288d.getMsgId();
            com.tencent.mm.ui.chatting.gallery.ta taVar = q1Var.f201289e;
            taVar.f(taVar.f201447y, 8);
            try {
                Ai = x51.w0.c(q1Var.f201290f);
            } catch (java.lang.OutOfMemoryError unused) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ImageGalleryAdapter", "[tomys] Oops, app img [%s] is too large, use resample version.", q1Var.f201290f);
                java.lang.Runtime.getRuntime().gc();
                java.lang.Runtime.getRuntime().runFinalization();
                Ai = ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).Ai(q1Var.f201290f);
            }
            if (Ai != null) {
                q1Var.f201289e.C.setEnableHorLongBmpMode(false);
                com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView = q1Var.f201289e.C;
                int width = Ai.getWidth();
                int height = Ai.getHeight();
                multiTouchImageView.f197651o = width;
                multiTouchImageView.f197652p = height;
                q1Var.f201289e.C.setImageBitmap(Ai);
                q1Var.f201289e.C.invalidate();
            }
        }
    }
}
