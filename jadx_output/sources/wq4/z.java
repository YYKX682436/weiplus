package wq4;

/* loaded from: classes14.dex */
public class z extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.video.OpenGlRender f448698a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.tencent.mm.plugin.voip.video.OpenGlRender openGlRender, android.os.Looper looper) {
        super(looper);
        this.f448698a = openGlRender;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        this.f448698a.g();
    }
}
