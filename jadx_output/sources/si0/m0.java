package si0;

/* loaded from: classes4.dex */
public final class m0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f408128d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(si0.n0 n0Var, android.content.Context context) {
        super(1);
        this.f408128d = context;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.pigeon.sns.PlatformRect platformRect;
        java.lang.Object value = ((kotlin.Result) obj).getValue();
        if (kotlin.Result.m528isSuccessimpl(value) && (platformRect = (com.tencent.pigeon.sns.PlatformRect) value) != null) {
            platformRect.getLeft();
            platformRect.getTop();
            platformRect.getWidth();
            platformRect.getHeight();
            double d17 = this.f408128d.getResources().getDisplayMetrics().density;
            android.graphics.Rect rect = new android.graphics.Rect((int) (platformRect.getLeft() * d17), (int) (platformRect.getTop() * d17), (int) ((platformRect.getLeft() + platformRect.getWidth()) * d17), (int) ((platformRect.getTop() + platformRect.getHeight()) * d17));
            int i17 = rect.left;
            int i18 = rect.top;
            int width = rect.width();
            int height = rect.height();
            java.lang.ref.WeakReference weakReference = si0.w0.f408206a;
            com.tencent.mm.plugin.sns.ui.SnsGalleryUI snsGalleryUI = weakReference != null ? (com.tencent.mm.plugin.sns.ui.SnsGalleryUI) weakReference.get() : null;
            if (snsGalleryUI != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateThumbRect", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
                if (snsGalleryUI.f167157y0 == null) {
                    snsGalleryUI.f167157y0 = new android.graphics.Rect();
                }
                snsGalleryUI.f167157y0.set(i17, i18, width + i17, height + i18);
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsGalleryUI", "updateThumbRect: %s", snsGalleryUI.f167157y0);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateThumbRect", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
            }
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(value);
        if (m524exceptionOrNullimpl != null) {
            m524exceptionOrNullimpl.getMessage();
        }
        return jz5.f0.f302826a;
    }
}
