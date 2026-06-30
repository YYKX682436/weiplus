package s24;

/* loaded from: classes.dex */
public abstract class g extends a24.a {

    /* renamed from: g, reason: collision with root package name */
    public final int f402365g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f402365g = 1;
    }

    @Override // a24.i
    public boolean X6() {
        return false;
    }

    @Override // a24.i
    public int Z6() {
        return 2;
    }

    @Override // a24.a, a24.i
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // a24.i
    public java.lang.String f7() {
        return getF161955i() ? "1" : "0";
    }

    @Override // a24.i
    public int h7() {
        return this.f402365g;
    }

    @Override // a24.i
    public final void r7(android.content.Context context, android.view.View itemView, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(itemView, "itemView");
    }

    /* renamed from: x7 */
    public abstract al5.c2 getF161960h();

    /* renamed from: y7 */
    public abstract boolean getF161955i();

    public boolean z7() {
        return this instanceof com.tencent.mm.plugin.setting.ui.setting_new.settings.notify.content.SettingSwitchNotifyContentDisplayAvatar;
    }
}
