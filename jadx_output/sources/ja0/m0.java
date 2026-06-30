package ja0;

@j95.b
/* loaded from: classes10.dex */
public final class m0 extends i95.w implements ka0.q0 {
    public dm.i8 Ai(android.app.Activity activity) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(activity, "activity");
        ql3.a z17 = ((kl3.z) ((kl3.i) sl3.b.b(kl3.i.class))).z();
        if (z17 != null) {
            return z17;
        }
        if (activity.getIntent().hasExtra("db_music_id")) {
            str = activity.getIntent().getStringExtra("db_music_id");
            kotlin.jvm.internal.o.d(str);
        } else {
            str = "";
        }
        return !android.text.TextUtils.isEmpty(str) ? ((kl3.z) ((kl3.i) sl3.b.b(kl3.i.class))).A(str) : z17;
    }

    public void wi(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, b21.r wrapper, r45.hf2 hf2Var, com.tencent.mm.pluginsdk.model.app.a5 a5Var) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(wrapper, "wrapper");
        ll3.h2.f319180a.b(context, str, str2, str3, str4, wrapper, hf2Var, a5Var);
    }
}
