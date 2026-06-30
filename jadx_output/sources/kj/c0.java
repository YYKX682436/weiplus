package kj;

/* loaded from: classes12.dex */
public class c0 implements lj.c {
    public c0(kj.d0 d0Var) {
    }

    @Override // lj.c
    public int a() {
        return 60;
    }

    @Override // lj.c
    public boolean b(long j17, int i17) {
        return j17 < ((long) (i17 * 5));
    }

    @Override // lj.c
    public void c(java.util.List list, int i17) {
        oj.j.f("Matrix.StartupTracer", "[fallback] size:%s targetSize:%s stack:%s", java.lang.Integer.valueOf(i17), 30, list);
        java.util.ListIterator listIterator = list.listIterator(java.lang.Math.min(i17, 30));
        while (listIterator.hasNext()) {
            listIterator.next();
            listIterator.remove();
        }
    }
}
