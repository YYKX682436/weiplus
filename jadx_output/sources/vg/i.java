package vg;

/* loaded from: classes16.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.protobuf.r3 f436442a;

    /* renamed from: b, reason: collision with root package name */
    public static final com.google.protobuf.j6 f436443b;

    /* renamed from: c, reason: collision with root package name */
    public static final com.google.protobuf.r3 f436444c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.google.protobuf.j6 f436445d;

    static {
        com.google.protobuf.d4 n17 = com.google.protobuf.d4.n(new java.lang.String[]{"\n\u000bPFS12.proto\u0012\u0005PFS12\"\u0095\u0001\n\rTaskTimeTrace\u0012\u000f\n\u0007task_id\u0018\u0001 \u0001(\r\u0012\u0011\n\ttask_name\u0018\u0002 \u0001(\t\u0012\u0010\n\btask_tag\u0018\u0003 \u0001(\t\u0012\u0012\n\nstart_time\u0018\u0004 \u0001(\u0001\u0012\u0010\n\bduration\u0018\u0005 \u0001(\u0001\u0012\u0013\n\u000btask_traits\u0018\u0006 \u0001(\u0004\u0012\u0013\n\u000bsub_task_id\u0018\n \u0003(\r\"v\n\tTimeTrace\u0012\u0010\n\btrace_id\u0018\u0001 \u0001(\t\u0012\u0012\n\ntrace_name\u0018\u0002 \u0001(\t\u0012\u0014\n\froot_task_id\u0018\u0003 \u0001(\r\u0012-\n\u000ftask_time_trace\u0018\u0004 \u0003(\u000b2\u0014.PFS12.TaskTimeTraceB#\n\u001acom.tencent.maas.profilingB\u0005PFS12b\u0006proto3"}, new com.google.protobuf.d4[0]);
        com.google.protobuf.r3 r3Var = (com.google.protobuf.r3) n17.l().get(0);
        f436442a = r3Var;
        f436443b = new com.google.protobuf.j6(r3Var, new java.lang.String[]{"TaskId", "TaskName", "TaskTag", "StartTime", "Duration", "TaskTraits", "SubTaskId"});
        com.google.protobuf.r3 r3Var2 = (com.google.protobuf.r3) n17.l().get(1);
        f436444c = r3Var2;
        f436445d = new com.google.protobuf.j6(r3Var2, new java.lang.String[]{"TraceId", "TraceName", "RootTaskId", "TaskTimeTrace"});
    }
}
