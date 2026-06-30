package i93;

/* loaded from: classes11.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f289719d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f289720e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f289721f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p13.v f289722g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(androidx.appcompat.app.AppCompatActivity appCompatActivity, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, p13.v vVar) {
        super(0);
        this.f289719d = appCompatActivity;
        this.f289720e = arrayList;
        this.f289721f = arrayList2;
        this.f289722g = vVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        i93.e eVar = ((com.tencent.mm.plugin.label.ui.searchLabel.LabelSearchUI) this.f289719d).f143394o;
        p13.r rVar = this.f289722g.f351159d;
        eVar.z(this.f289720e);
        eVar.f289728e = this.f289721f;
        return jz5.f0.f302826a;
    }
}
