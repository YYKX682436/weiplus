package ok5;

/* loaded from: classes12.dex */
public final class b extends com.tencent.mm.ui.component.UIComponent {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        ok5.c cVar = ok5.c.f346065a;
        android.content.Intent intent = getIntent();
        kotlin.jvm.internal.o.g(intent, "intent");
        java.util.Map b17 = cVar.b(intent);
        if (b17 != null) {
            kz5.h0.A(b17.entrySet(), ok5.a.f346064d);
            cVar.a(getIntent());
        }
    }
}
