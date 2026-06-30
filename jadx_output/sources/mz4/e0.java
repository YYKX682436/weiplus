package mz4;

/* loaded from: classes12.dex */
public class e0 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText f333275d;

    public e0(com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText wXRTEditText) {
        this.f333275d = wXRTEditText;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText wXRTEditText = this.f333275d;
        nz4.f fVar = wXRTEditText.R;
        if (fVar != null && fVar.a() == 1) {
            int i17 = wXRTEditText.R.f341607f;
            wXRTEditText.D();
            wXRTEditText.z(i17, false);
        }
        return true;
    }
}
