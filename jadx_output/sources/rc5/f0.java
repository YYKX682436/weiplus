package rc5;

/* loaded from: classes11.dex */
public class f0 extends com.tencent.mm.ui.chatting.db {
    public final jz5.g A;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f394157z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f394157z = jz5.h.b(new rc5.e0(this));
        this.A = jz5.h.b(new rc5.d0(activity, this));
    }

    @Override // com.tencent.mm.ui.chatting.db
    public int X6() {
        return (int) (((java.lang.Number) ((jz5.n) this.f394157z).getValue()).intValue() * 0.8f);
    }

    @Override // com.tencent.mm.ui.chatting.db
    public int e7(int i17) {
        return i17;
    }

    @Override // com.tencent.mm.ui.chatting.db
    public boolean h7(com.tencent.mm.ui.chatting.component.pe headerComponent, com.tencent.mm.ui.bc optionListener, yb5.d chattingContext) {
        kotlin.jvm.internal.o.g(headerComponent, "headerComponent");
        kotlin.jvm.internal.o.g(optionListener, "optionListener");
        kotlin.jvm.internal.o.g(chattingContext, "chattingContext");
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.db, com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        super.onResume();
    }
}
