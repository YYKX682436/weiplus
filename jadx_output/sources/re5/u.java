package re5;

/* loaded from: classes12.dex */
public final class u extends lf3.n implements qf3.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // qf3.b
    public boolean X0(android.content.Intent intent, qf3.a listener) {
        kotlin.jvm.internal.o.g(intent, "intent");
        kotlin.jvm.internal.o.g(listener, "listener");
        java.lang.String stringExtra = intent.getStringExtra("KEY_PATH");
        if (stringExtra == null) {
            stringExtra = "";
        }
        java.lang.String stringExtra2 = intent.getStringExtra("KEY_VIDEO_FILE_NAME");
        java.lang.String str = stringExtra2 != null ? stringExtra2 : "";
        mf3.f fVar = new mf3.f();
        re5.t tVar = new re5.t(stringExtra, str);
        fVar.add(tVar);
        int size = fVar.size() - 1;
        lf3.c0 c0Var = (lf3.c0) listener;
        c0Var.Y6(tVar.getId());
        c0Var.X6(fVar, false);
        listener.T3(size);
        return true;
    }
}
