package o25;

/* loaded from: classes9.dex */
public abstract class q2 implements l81.e1 {
    public q2(android.content.Context context) {
        if (context instanceof android.app.Activity) {
            ((android.app.Application) com.tencent.mm.sdk.platformtools.x2.f193071a).registerActivityLifecycleCallbacks(new o25.p2(this, context, this));
        }
    }
}
