package kf3;

/* loaded from: classes5.dex */
public class q2 implements com.tencent.mm.pluginsdk.ui.chat.v9 {

    /* renamed from: a, reason: collision with root package name */
    public final kf3.u f307418a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f307419b;

    public q2(kf3.u uVar) {
        this.f307418a = uVar;
        this.f307419b = uVar.f307436a;
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.v9
    public void a(boolean z17, int i17) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.v9
    public void b(com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_mass_send_emoji, false)) {
            android.content.Context context = this.f307419b;
            dp.a.makeText(context, context.getString(com.tencent.mm.R.string.gt6), 0).show();
        } else {
            kf3.u uVar = this.f307418a;
            uVar.getClass();
            uVar.f307436a.c7(new kf3.r(uVar, iEmojiInfo));
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.v9
    public void c() {
    }
}
