package lr;

/* loaded from: classes15.dex */
public final class l implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lr.p f320550a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f320551b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.api.IEmojiInfo f320552c;

    public l(lr.p pVar, android.content.Context context, com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        this.f320550a = pVar;
        this.f320551b = context;
        this.f320552c = iEmojiInfo;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        if (z17) {
            lr.p.c(this.f320550a, this.f320551b, this.f320552c);
        }
    }
}
