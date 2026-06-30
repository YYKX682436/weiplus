package mx0;

/* loaded from: classes5.dex */
public final class k3 extends cu0.x {

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f332095p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider, android.content.Context context, yz5.l ignoreBackgroundTouchEvent) {
        super(recordConfigProvider, context, ignoreBackgroundTouchEvent);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(ignoreBackgroundTouchEvent, "ignoreBackgroundTouchEvent");
        this.f332095p = "MicroMsg.ShootComposingMusicPicker";
    }

    @Override // cu0.x
    public cu0.y d(yz5.l ignoreBackgroundTouchEvent) {
        kotlin.jvm.internal.o.g(ignoreBackgroundTouchEvent, "ignoreBackgroundTouchEvent");
        return new mx0.n3(this.f222351a, ignoreBackgroundTouchEvent);
    }

    @Override // cu0.x
    public java.lang.String j() {
        return this.f332095p;
    }

    @Override // cu0.x
    public boolean m() {
        if (!super.m()) {
            return false;
        }
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo = this.f222355e;
        return !(audioCacheInfo != null && audioCacheInfo.f155719p == 7);
    }

    public final mx0.n3 o() {
        cu0.y g17 = g();
        kotlin.jvm.internal.o.e(g17, "null cannot be cast to non-null type com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingMusicPickerDrawerImpl");
        return (mx0.n3) g17;
    }
}
