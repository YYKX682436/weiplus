package gl;

/* loaded from: classes14.dex */
public final class w implements android.media.AudioManager.OnCommunicationDeviceChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gl.y f272782a;

    public w(gl.y yVar) {
        this.f272782a = yVar;
    }

    @Override // android.media.AudioManager.OnCommunicationDeviceChangedListener
    public final void onCommunicationDeviceChanged(android.media.AudioDeviceInfo audioDeviceInfo) {
        gl.y yVar = this.f272782a;
        kotlinx.coroutines.l.d(yVar.f272793h, null, null, new gl.v(yVar, audioDeviceInfo, null), 3, null);
    }
}
