package yo4;

/* loaded from: classes5.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yo4.p f464270d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(yo4.p pVar) {
        super(1);
        this.f464270d = pVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.EditAddMusicPlugin", "[onBgmVolumeChanged] bgmVolume=" + intValue);
        iu3.i iVar = this.f464270d.f464285p;
        float f17 = ((float) e06.p.f(intValue, 0, 100)) / ((float) 100);
        iVar.getClass();
        float e17 = e06.p.e(f17, 0.0f, 1.0f);
        com.tencent.mars.xlog.Log.i(iVar.f295007b, "setVolume " + e17);
        iVar.f295009e = java.lang.Float.valueOf(e17);
        kk4.v vVar = iVar.f295008c;
        if (vVar != null) {
            vVar.K(e17);
        }
        return jz5.f0.f302826a;
    }
}
