package ep1;

/* loaded from: classes8.dex */
public abstract class m {
    public static final void a(android.app.Activity activity, boolean z17) {
        db5.f.c(activity, new ep1.l(z17, activity));
    }

    public static final void b(android.content.Context context, android.content.Intent intent, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(intent, "intent");
        c(context, intent, z17, null);
    }

    public static final void c(android.content.Context context, android.content.Intent intent, boolean z17, com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(intent, "intent");
        intent.putExtras(f(context));
        intent.putExtra("MMActivity.OverrideExitAnimation", com.tencent.mm.R.anim.f477728p);
        intent.putExtra("MMActivity.OverrideEnterAnimation", com.tencent.mm.R.anim.f477728p);
        intent.putExtra("key_enter_from_float_ball", true);
        intent.putExtra("key_enter_with_animation", z17);
        intent.putExtra("key_enter_orientation", context.getResources().getConfiguration().orientation);
        if (ballInfo != null) {
            intent.putExtra("key_enter_group_type", ballInfo.f93048f);
        }
    }

    public static final void d(android.content.Context context, android.os.Bundle bundle, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(bundle, "bundle");
        if (z17) {
            bundle.putAll(f(context));
            bundle.putInt("MMActivity.OverrideExitAnimation", 0);
            bundle.putInt("MMActivity.OverrideEnterAnimation", 0);
        }
        bundle.putBoolean("key_enter_from_float_ball", true);
        bundle.putBoolean("key_enter_with_animation", z17);
        bundle.putInt("key_enter_orientation", context.getResources().getConfiguration().orientation);
    }

    public static final void e(android.app.Activity activity) {
        android.content.Intent intent;
        android.content.Intent intent2;
        if (activity != null && (intent2 = activity.getIntent()) != null) {
            intent2.putExtra("MMActivity.OverrideExitAnimation", com.tencent.mm.R.anim.f477728p);
        }
        if (activity == null || (intent = activity.getIntent()) == null) {
            return;
        }
        intent.putExtra("MMActivity.OverrideEnterAnimation", com.tencent.mm.R.anim.f477728p);
    }

    public static final android.os.Bundle f(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        android.os.Bundle bundle = android.app.ActivityOptions.makeCustomAnimation(context, 0, 0).toBundle();
        kotlin.jvm.internal.o.f(bundle, "toBundle(...)");
        return bundle;
    }

    public static final boolean g(android.content.Intent intent) {
        if (intent != null) {
            return intent.getBooleanExtra("key_enter_from_float_ball", false);
        }
        return false;
    }

    public static final boolean h(android.content.Intent intent) {
        if (g(intent)) {
            return intent != null ? intent.getBooleanExtra("key_enter_with_animation", false) : false;
        }
        return false;
    }
}
