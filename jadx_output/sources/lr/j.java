package lr;

/* loaded from: classes15.dex */
public final class j implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lr.p f320530a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f320531b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.api.IEmojiInfo f320532c;

    public j(lr.p pVar, android.content.Context context, com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        this.f320530a = pVar;
        this.f320531b = context;
        this.f320532c = iEmojiInfo;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        if (z17) {
            lr.p.c(this.f320530a, this.f320531b, this.f320532c);
        }
    }
}
