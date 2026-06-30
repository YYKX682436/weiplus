package pf5;

/* loaded from: classes.dex */
public abstract class j0 {
    public static final android.content.Intent a(android.content.Intent intent, java.lang.Class intentAction) {
        kotlin.jvm.internal.o.g(intent, "<this>");
        kotlin.jvm.internal.o.g(intentAction, "intentAction");
        java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("key_intent_action_uic_list");
        if (stringArrayListExtra == null) {
            stringArrayListExtra = new java.util.ArrayList<>();
        }
        if (!stringArrayListExtra.contains(intentAction.getName())) {
            stringArrayListExtra.add(intentAction.getName());
        }
        intent.putStringArrayListExtra("key_intent_action_uic_list", stringArrayListExtra);
        return intent;
    }
}
