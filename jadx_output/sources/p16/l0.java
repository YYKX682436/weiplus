package p16;

/* loaded from: classes16.dex */
public class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Stack f351320a = new java.util.Stack();

    public l0(p16.k0 k0Var) {
    }

    public final void a(p16.g gVar) {
        if (!gVar.k()) {
            if (gVar instanceof p16.o0) {
                p16.o0 o0Var = (p16.o0) gVar;
                a(o0Var.f351332f);
                a(o0Var.f351333g);
                return;
            } else {
                java.lang.String valueOf = java.lang.String.valueOf(gVar.getClass());
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder(valueOf.length() + 49);
                sb6.append("Has a new type of ByteString been created? Found ");
                sb6.append(valueOf);
                throw new java.lang.IllegalArgumentException(sb6.toString());
            }
        }
        int size = gVar.size();
        int[] iArr = p16.o0.f351330n;
        int binarySearch = java.util.Arrays.binarySearch(iArr, size);
        if (binarySearch < 0) {
            binarySearch = (-(binarySearch + 1)) - 1;
        }
        int i17 = iArr[binarySearch + 1];
        java.util.Stack stack = this.f351320a;
        if (stack.isEmpty() || ((p16.g) stack.peek()).size() >= i17) {
            stack.push(gVar);
            return;
        }
        int i18 = iArr[binarySearch];
        p16.g gVar2 = (p16.g) stack.pop();
        while (!stack.isEmpty() && ((p16.g) stack.peek()).size() < i18) {
            gVar2 = new p16.o0((p16.g) stack.pop(), gVar2);
        }
        p16.o0 o0Var2 = new p16.o0(gVar2, gVar);
        while (!stack.isEmpty()) {
            int[] iArr2 = p16.o0.f351330n;
            int binarySearch2 = java.util.Arrays.binarySearch(iArr2, o0Var2.f351331e);
            if (binarySearch2 < 0) {
                binarySearch2 = (-(binarySearch2 + 1)) - 1;
            }
            if (((p16.g) stack.peek()).size() >= iArr2[binarySearch2 + 1]) {
                break;
            } else {
                o0Var2 = new p16.o0((p16.g) stack.pop(), o0Var2);
            }
        }
        stack.push(o0Var2);
    }
}
