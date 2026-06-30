package lr;

/* loaded from: classes15.dex */
public final class o implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lr.p f320557a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f320558b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.api.IEmojiInfo f320559c;

    public o(lr.p pVar, android.content.Context context, com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        this.f320557a = pVar;
        this.f320558b = context;
        this.f320559c = iEmojiInfo;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        if (z17) {
            lr.p.c(this.f320557a, this.f320558b, this.f320559c);
        }
    }
}
