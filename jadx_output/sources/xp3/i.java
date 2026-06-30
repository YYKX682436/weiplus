package xp3;

/* loaded from: classes7.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f455927a = new java.util.HashMap();

    public static com.tencent.mm.plugin.performance.elf.AbstractProcessChecker a(java.lang.Class cls) {
        java.util.HashMap hashMap = f455927a;
        if (hashMap.containsKey(cls)) {
            return (com.tencent.mm.plugin.performance.elf.AbstractProcessChecker) hashMap.get(cls);
        }
        try {
            com.tencent.mm.plugin.performance.elf.AbstractProcessChecker abstractProcessChecker = (com.tencent.mm.plugin.performance.elf.AbstractProcessChecker) cls.newInstance();
            hashMap.put(cls, abstractProcessChecker);
            return abstractProcessChecker;
        } catch (java.lang.IllegalAccessException | java.lang.InstantiationException unused) {
            return null;
        }
    }
}
