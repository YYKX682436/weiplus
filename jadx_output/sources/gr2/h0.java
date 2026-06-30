package gr2;

/* loaded from: classes10.dex */
public final class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ byte[] f274772d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.ui.special.view.PlayTogetherVoiceRoomLinkMicView f274773e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f274774f;

    public h0(byte[] bArr, com.tencent.mm.plugin.finder.nearby.ui.special.view.PlayTogetherVoiceRoomLinkMicView playTogetherVoiceRoomLinkMicView, java.lang.ref.WeakReference weakReference) {
        this.f274772d = bArr;
        this.f274773e = playTogetherVoiceRoomLinkMicView;
        this.f274774f = weakReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArr = this.f274772d;
        java.lang.String str = bArr != null ? new java.lang.String(bArr, r26.c.f368865a) : null;
        int i17 = com.tencent.mm.plugin.finder.nearby.ui.special.view.PlayTogetherVoiceRoomLinkMicView.B;
        com.tencent.mm.plugin.finder.nearby.ui.special.view.PlayTogetherVoiceRoomLinkMicView playTogetherVoiceRoomLinkMicView = this.f274773e;
        boolean z17 = true;
        playTogetherVoiceRoomLinkMicView.r("handleSeiMessage seiData:" + bArr + " seiMessage:" + str, 1);
        if (str != null && r26.n0.B(str, "TencentStreamSEI", false)) {
            return;
        }
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        if (z17) {
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            int optInt = jSONObject.optInt("wxT");
            if (optInt == 0 || com.tencent.mm.sdk.platformtools.t8.K0(jSONObject.optString("d"))) {
                return;
            }
            com.tencent.mm.plugin.finder.nearby.ui.special.view.PlayTogetherVoiceRoomLinkMicView.a(playTogetherVoiceRoomLinkMicView, optInt, jSONObject, this.f274774f);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("VoiceRoomLinkMicView", e17, "", new java.lang.Object[0]);
        }
    }
}
