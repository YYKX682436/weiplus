package nx1;

/* loaded from: classes12.dex */
public class t implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText f341322d;

    public t(com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText wXRTEditText) {
        this.f341322d = wXRTEditText;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText wXRTEditText = this.f341322d;
        ox1.c cVar = wXRTEditText.R;
        if (cVar != null && cVar.a() == 1) {
            int i17 = wXRTEditText.R.f349586f;
            wXRTEditText.C();
            wXRTEditText.z(i17, false);
        }
        return true;
    }
}
