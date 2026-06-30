package tr3;

/* loaded from: classes11.dex */
public abstract class c {
    public static java.lang.String a(r45.km kmVar) {
        r45.lm lmVar;
        if (kmVar == null || (lmVar = kmVar.f378815d) == null || lmVar.f379589g == null) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[");
        java.util.Iterator it = kmVar.f378815d.f379589g.iterator();
        while (it.hasNext()) {
            r45.mm mmVar = (r45.mm) it.next();
            sb6.append(mmVar.f380635d + "#" + mmVar.f380638g + ";");
            java.util.LinkedList linkedList = mmVar.f380640i;
            if (linkedList != null) {
                java.util.Iterator it6 = linkedList.iterator();
                while (it6.hasNext()) {
                    r45.mm mmVar2 = (r45.mm) it6.next();
                    sb6.append(mmVar2.f380635d + "#" + mmVar2.f380638g + ";");
                }
            }
        }
        sb6.append("]");
        return sb6.toString();
    }

    public static java.lang.String b(r45.gl glVar) {
        if (glVar == null) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[");
        java.util.Iterator it = glVar.f375323d.iterator();
        while (it.hasNext()) {
            r45.s5 s5Var = (r45.s5) it.next();
            r45.y5 y5Var = s5Var.f385509d;
            if (y5Var != null) {
                long j17 = y5Var.f390790d;
                r45.p5 p5Var = s5Var.f385514i;
                if (p5Var == null) {
                    sb6.append(j17);
                    sb6.append(";");
                } else {
                    java.util.LinkedList linkedList = p5Var.f382754e;
                    if (linkedList != null) {
                        java.util.Iterator it6 = linkedList.iterator();
                        while (it6.hasNext()) {
                            r45.o5 o5Var = (r45.o5) it6.next();
                            sb6.append(j17);
                            sb6.append("#");
                            sb6.append(o5Var.f381916g);
                            sb6.append(";");
                        }
                    }
                }
            }
        }
        sb6.append("]");
        return sb6.toString();
    }

    public static void c(java.lang.String str, int i17, int i18, int i19, long j17, long j18, int i27, int i28, int i29, int i37, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, android.content.Intent intent, int i38) {
        long j19 = j17 / 1000;
        long j27 = j18 / 1000;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10298, str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i37), str2, str3, str4, java.lang.Integer.valueOf(com.tencent.mm.storage.c2.f193803a), str5, str6, str7, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Integer.valueOf(intent != null ? intent.getIntExtra("Contact_Sub_Scene", 0) : 0), java.lang.Integer.valueOf(i38));
    }
}
