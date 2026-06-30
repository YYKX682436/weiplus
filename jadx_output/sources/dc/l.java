package dc;

/* loaded from: classes16.dex */
public enum l {
    UNREACHABLE(0, "unreachable object"),
    /* JADX INFO: Fake field, exist only in values array */
    INVALID_TYPE(1, "invalid type"),
    INTERNED_STRING(2, "interned string"),
    UNKNOWN(3, com.eclipsesource.mmv8.Platform.UNKNOWN),
    SYSTEM_CLASS(4, "system class"),
    VM_INTERNAL(5, "vm internal"),
    DEBUGGER(6, "debugger"),
    NATIVE_LOCAL(7, "native local"),
    NATIVE_STATIC(8, "native static"),
    THREAD_BLOCK(9, "thread block"),
    BUSY_MONITOR(10, "busy monitor"),
    NATIVE_MONITOR(11, "native monitor"),
    REFERENCE_CLEANUP(12, "reference cleanup"),
    FINALIZING(13, "finalizing"),
    JAVA_LOCAL(14, "java local"),
    NATIVE_STACK(15, "native stack"),
    /* JADX INFO: Fake field, exist only in values array */
    JAVA_STATIC(16, "java static");


    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f228653d;

    l(int i17, java.lang.String str) {
        this.f228653d = str;
    }
}
