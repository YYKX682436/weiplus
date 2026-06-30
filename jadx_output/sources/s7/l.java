package s7;

/* loaded from: classes15.dex */
public enum l {
    /* JADX INFO: Fake field, exist only in values array */
    target,
    /* JADX INFO: Fake field, exist only in values array */
    root,
    nth_child,
    /* JADX INFO: Fake field, exist only in values array */
    nth_last_child,
    nth_of_type,
    nth_last_of_type,
    /* JADX INFO: Fake field, exist only in values array */
    first_child,
    /* JADX INFO: Fake field, exist only in values array */
    last_child,
    /* JADX INFO: Fake field, exist only in values array */
    first_of_type,
    /* JADX INFO: Fake field, exist only in values array */
    last_of_type,
    /* JADX INFO: Fake field, exist only in values array */
    only_child,
    /* JADX INFO: Fake field, exist only in values array */
    only_of_type,
    /* JADX INFO: Fake field, exist only in values array */
    empty,
    /* JADX INFO: Fake field, exist only in values array */
    not,
    /* JADX INFO: Fake field, exist only in values array */
    indeterminate,
    /* JADX INFO: Fake field, exist only in values array */
    indeterminate,
    /* JADX INFO: Fake field, exist only in values array */
    indeterminate,
    /* JADX INFO: Fake field, exist only in values array */
    indeterminate,
    /* JADX INFO: Fake field, exist only in values array */
    indeterminate,
    /* JADX INFO: Fake field, exist only in values array */
    indeterminate,
    /* JADX INFO: Fake field, exist only in values array */
    indeterminate,
    /* JADX INFO: Fake field, exist only in values array */
    indeterminate,
    /* JADX INFO: Fake field, exist only in values array */
    indeterminate,
    /* JADX INFO: Fake field, exist only in values array */
    indeterminate,
    UNSUPPORTED;


    /* renamed from: h, reason: collision with root package name */
    public static final java.util.Map f403708h = new java.util.HashMap();

    static {
        for (s7.l lVar : values()) {
            if (lVar != UNSUPPORTED) {
                ((java.util.HashMap) f403708h).put(lVar.name().replace('_', '-'), lVar);
            }
        }
    }
}
