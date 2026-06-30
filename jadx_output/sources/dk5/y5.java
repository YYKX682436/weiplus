package dk5;

/* loaded from: classes9.dex */
public class y5 implements tg3.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f235007a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f235008b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ tg3.x0 f235009c;

    public y5(dk5.s5 s5Var, android.content.Context context, int i17, tg3.x0 x0Var) {
        this.f235007a = context;
        this.f235008b = i17;
        this.f235009c = x0Var;
    }

    @Override // tg3.x0
    public void a(int i17, int i18, java.util.List list, byte[] bArr) {
        if (i17 == 0 && i18 == 0) {
            com.tencent.mm.ui.widget.dialog.u3 u3Var = com.tencent.mm.ui.chatting.hd.f201679a;
            com.tencent.wework.api.model.WWMediaBufferMessage wWMediaBufferMessage = new com.tencent.wework.api.model.WWMediaBufferMessage();
            wWMediaBufferMessage.f220147f = bArr;
            com.tencent.wework.api.WWAPIFactory.a(this.f235007a).a(wWMediaBufferMessage, com.tencent.mm.ui.chatting.hd.d(this.f235008b));
        }
        this.f235009c.a(i17, i18, list, bArr);
    }
}
