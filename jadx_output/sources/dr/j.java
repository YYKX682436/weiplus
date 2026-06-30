package dr;

/* loaded from: classes12.dex */
public class j extends dr.s {

    /* renamed from: c, reason: collision with root package name */
    public final dr.q f242389c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.tencent.mm.api.IEmojiInfo emojiInfo, dr.q qVar) {
        super(emojiInfo);
        kotlin.jvm.internal.o.g(emojiInfo, "emojiInfo");
        this.f242389c = qVar;
    }

    @Override // dr.s
    public void c(boolean z17) {
        dr.q qVar = this.f242389c;
        if (qVar != null) {
            qVar.a(z17);
        }
    }

    @Override // dr.s
    public void f(boolean z17) {
        if (this.f242400a.E0()) {
            c(true);
        } else {
            d(z17);
        }
    }
}
