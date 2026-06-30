package lr;

/* loaded from: classes15.dex */
public final class m implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lr.p f320553a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f320554b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.api.IEmojiInfo f320555c;

    public m(lr.p pVar, android.content.Context context, com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        this.f320553a = pVar;
        this.f320554b = context;
        this.f320555c = iEmojiInfo;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        if (z17) {
            lr.p.c(this.f320553a, this.f320554b, this.f320555c);
        }
    }
}
