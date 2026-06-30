package yn;

/* loaded from: classes5.dex */
public abstract class g {
    public static final android.content.Intent a(android.content.Intent intent, java.lang.Class component) {
        kotlin.jvm.internal.o.g(intent, "<this>");
        kotlin.jvm.internal.o.g(component, "component");
        java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("key_intent_chatting_components");
        if (stringArrayListExtra == null) {
            stringArrayListExtra = new java.util.ArrayList<>();
        }
        if (!stringArrayListExtra.contains(component.getName())) {
            stringArrayListExtra.add(component.getName());
        }
        intent.putStringArrayListExtra("key_intent_chatting_components", stringArrayListExtra);
        return intent;
    }
}
