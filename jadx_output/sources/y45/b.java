package y45;

/* loaded from: classes12.dex */
public abstract class b {
    public static boolean a(java.lang.String str) {
        return "java".equals(str) || "native".equals(str) || "kill".equals(str) || com.tencent.mm.app.MMBugReportContents.f53222c.equals(str) || "random".equals(str);
    }

    public static void b(android.content.Context context) {
        d55.w wVar = new d55.w(context, "recovery_exercise");
        wVar.e();
        long j17 = 0;
        wVar.g("exercise_flags", j17);
        wVar.h();
        d55.w wVar2 = new d55.w(context, "recovery_exercise");
        wVar2.e();
        wVar2.b();
        wVar2.f226622c.putString("exercise_base_tinker_id", null);
        wVar2.h();
        d55.w wVar3 = new d55.w(context, "recovery_exercise");
        wVar3.e();
        wVar3.b();
        wVar3.f226622c.putString("exercise_process", null);
        wVar3.h();
        d55.m.a(context, 0);
        d55.w wVar4 = new d55.w(context, "recovery_exercise");
        wVar4.e();
        wVar4.g("exercise_delay", j17);
        wVar4.h();
        d55.w wVar5 = new d55.w(context, "recovery_exercise");
        wVar5.e();
        wVar5.b();
        wVar5.f226622c.putString("exercise_crash_type", null);
        wVar5.h();
    }
}
