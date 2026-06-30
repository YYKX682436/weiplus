package j06;

/* loaded from: classes12.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f297057d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.util.Map map) {
        super(0);
        this.f297057d = map;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = 0;
        for (java.util.Map.Entry entry : this.f297057d.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.lang.Object value = entry.getValue();
            i17 += (value instanceof boolean[] ? java.util.Arrays.hashCode((boolean[]) value) : value instanceof char[] ? java.util.Arrays.hashCode((char[]) value) : value instanceof byte[] ? java.util.Arrays.hashCode((byte[]) value) : value instanceof short[] ? java.util.Arrays.hashCode((short[]) value) : value instanceof int[] ? java.util.Arrays.hashCode((int[]) value) : value instanceof float[] ? java.util.Arrays.hashCode((float[]) value) : value instanceof long[] ? java.util.Arrays.hashCode((long[]) value) : value instanceof double[] ? java.util.Arrays.hashCode((double[]) value) : value instanceof java.lang.Object[] ? java.util.Arrays.hashCode((java.lang.Object[]) value) : value.hashCode()) ^ (str.hashCode() * 127);
        }
        return java.lang.Integer.valueOf(i17);
    }
}
