package e83;

/* loaded from: classes16.dex */
public abstract class o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.protobuf.r3 f250195a;

    /* renamed from: b, reason: collision with root package name */
    public static final com.google.protobuf.j6 f250196b;

    /* renamed from: c, reason: collision with root package name */
    public static final com.google.protobuf.r3 f250197c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.google.protobuf.j6 f250198d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.google.protobuf.r3 f250199e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.google.protobuf.j6 f250200f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.google.protobuf.r3 f250201g;

    /* renamed from: h, reason: collision with root package name */
    public static final com.google.protobuf.j6 f250202h;

    /* renamed from: i, reason: collision with root package name */
    public static final com.google.protobuf.r3 f250203i;

    /* renamed from: j, reason: collision with root package name */
    public static final com.google.protobuf.j6 f250204j;

    /* renamed from: k, reason: collision with root package name */
    public static final com.google.protobuf.r3 f250205k;

    /* renamed from: l, reason: collision with root package name */
    public static final com.google.protobuf.j6 f250206l;

    /* renamed from: m, reason: collision with root package name */
    public static final com.google.protobuf.r3 f250207m;

    /* renamed from: n, reason: collision with root package name */
    public static final com.google.protobuf.j6 f250208n;

    /* renamed from: o, reason: collision with root package name */
    public static final com.google.protobuf.r3 f250209o;

    /* renamed from: p, reason: collision with root package name */
    public static final com.google.protobuf.j6 f250210p;

    /* renamed from: q, reason: collision with root package name */
    public static final com.google.protobuf.r3 f250211q;

    /* renamed from: r, reason: collision with root package name */
    public static final com.google.protobuf.j6 f250212r;

    /* renamed from: s, reason: collision with root package name */
    public static final com.google.protobuf.r3 f250213s;

    /* renamed from: t, reason: collision with root package name */
    public static final com.google.protobuf.j6 f250214t;

    /* renamed from: u, reason: collision with root package name */
    public static final com.google.protobuf.r3 f250215u;

    /* renamed from: v, reason: collision with root package name */
    public static final com.google.protobuf.j6 f250216v;

    /* renamed from: w, reason: collision with root package name */
    public static final com.google.protobuf.r3 f250217w;

    /* renamed from: x, reason: collision with root package name */
    public static final com.google.protobuf.j6 f250218x;

    /* renamed from: y, reason: collision with root package name */
    public static final com.google.protobuf.r3 f250219y;

    /* renamed from: z, reason: collision with root package name */
    public static final com.google.protobuf.j6 f250220z;

    static {
        com.google.protobuf.d4 n17 = com.google.protobuf.d4.n(new java.lang.String[]{"\n\u001fmain/ilink_check_resource.proto\u0012\u0005ilink\"@\n\rLocalResource\u0012\u0015\n\rresource_name\u0018\u0001 \u0001(\t\u0012\u0018\n\u0010resource_version\u0018\u0002 \u0001(\r\"0\n\u0012StringKeyValuePair\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\t\u0012\r\n\u0005value\u0018\u0002 \u0001(\t\"^\n\u0005Value\u0012\u0013\n\u000bint64_value\u0018\u0001 \u0001(\u0003\u0012\u0014\n\fdouble_value\u0018\u0002 \u0001(\u0001\u0012\u0014\n\fstring_value\u0018\u0003 \u0001(\t\u0012\u0014\n\fuint64_value\u0018\u0005 \u0001(\u0004\"A\n\u0015ParameterKeyValuePair\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\t\u0012\u001b\n\u0005value\u0018\u0002 \u0001(\u000b2\f.ilink.Value\"¨\u0001\n\u001aGetResourceDescriptionInfo\u0012\u0012\n\nproject_id\u0018\u0001 \u0001(\t\u0012\u0015\n\rresource_name\u0018\u0002 \u0001(\t\u0012-\n\u000flocal_resources\u0018\u0003 \u0003(\u000b2\u0014.ilink.LocalResource\u00120\n\nparameters\u0018\u0004 \u0003(\u000b2\u001c.ilink.ParameterKeyValuePair\"C\n\u0007ExtInfo\u00128\n\u0015string_key_value_list\u0018\u0001 \u0003(\u000b2\u0019.ilink.StringKeyValuePair\"»\u0001\n\fResourceInfo\u0012\u0012\n\nproject_id\u0018\u0001 \u0001(\t\u0012\u0015\n\rresource_name\u0018\u0002 \u0001(\t\u0012\u0018\n\u0010resource_version\u0018\u0003 \u0001(\r\u0012\u0015\n\rresource_size\u0018\u0004 \u0001(\r\u0012\u000b\n\u0003md5\u0018\u0005 \u0001(\t\u0012\u000b\n\u0003url\u0018\u0006 \u0001(\t\u0012\u0013\n\u000bcreate_time\u0018\u0007 \u0001(\r\u0012 \n\bext_info\u0018\b \u0001(\u000b2\u000e.ilink.ExtInfo\":\n\u0010ResourceResponse\u0012&\n\tresources\u0018\u0001 \u0003(\u000b2\u0013.ilink.ResourceInfo\"V\n\u001fBatchGetResourceDescriptionInfo\u00123\n\breq_list\u0018\u0001 \u0003(\u000b2!.ilink.GetResourceDescriptionInfo\"±\u0001\n\u001cBatchResourceDescriptionList\u0012>\n\tresp_list\u0018\u0001 \u0003(\u000b2+.ilink.BatchResourceDescriptionList.OneResp\u001aQ\n\u0007OneResp\u0012\u0012\n\nproject_id\u0018\u0001 \u0001(\t\u0012\u000b\n\u0003ret\u0018\u0002 \u0001(\u0005\u0012%\n\u0004resp\u0018\u0003 \u0001(\u000b2\u0017.ilink.ResourceResponse\".\n\tMsgSysCmd\u0012\u000f\n\u0007content\u0018\u0001 \u0001(\t\u0012\u0010\n\bsub_type\u0018\u0002 \u0001(\t\"E\n\u0012ResourceUpdateInfo\u0012\u0015\n\rresource_name\u0018\u0001 \u0001(\t\u0012\u0018\n\u0010resource_version\u0018\u0002 \u0001(\r\"k\n\u001cProjectResourceUpdateMessage\u0012\u0012\n\nproject_id\u0018\u0001 \u0001(\t\u00127\n\u0014resource_update_list\u0018\u0002 \u0003(\u000b2\u0019.ilink.ResourceUpdateInfoB/\n$com.tencent.mm.plugin.ilink.resourceB\u0005ProtoH\u0003"}, new com.google.protobuf.d4[0]);
        com.google.protobuf.r3 r3Var = (com.google.protobuf.r3) n17.l().get(0);
        f250195a = r3Var;
        f250196b = new com.google.protobuf.j6(r3Var, new java.lang.String[]{"ResourceName", "ResourceVersion"});
        com.google.protobuf.r3 r3Var2 = (com.google.protobuf.r3) n17.l().get(1);
        f250197c = r3Var2;
        f250198d = new com.google.protobuf.j6(r3Var2, new java.lang.String[]{"Key", "Value"});
        com.google.protobuf.r3 r3Var3 = (com.google.protobuf.r3) n17.l().get(2);
        f250199e = r3Var3;
        f250200f = new com.google.protobuf.j6(r3Var3, new java.lang.String[]{"Int64Value", "DoubleValue", "StringValue", "Uint64Value"});
        com.google.protobuf.r3 r3Var4 = (com.google.protobuf.r3) n17.l().get(3);
        f250201g = r3Var4;
        f250202h = new com.google.protobuf.j6(r3Var4, new java.lang.String[]{"Key", "Value"});
        com.google.protobuf.r3 r3Var5 = (com.google.protobuf.r3) n17.l().get(4);
        f250203i = r3Var5;
        f250204j = new com.google.protobuf.j6(r3Var5, new java.lang.String[]{"ProjectId", "ResourceName", "LocalResources", "Parameters"});
        com.google.protobuf.r3 r3Var6 = (com.google.protobuf.r3) n17.l().get(5);
        f250205k = r3Var6;
        f250206l = new com.google.protobuf.j6(r3Var6, new java.lang.String[]{"StringKeyValueList"});
        com.google.protobuf.r3 r3Var7 = (com.google.protobuf.r3) n17.l().get(6);
        f250207m = r3Var7;
        f250208n = new com.google.protobuf.j6(r3Var7, new java.lang.String[]{"ProjectId", "ResourceName", "ResourceVersion", "ResourceSize", "Md5", "Url", "CreateTime", "ExtInfo"});
        com.google.protobuf.r3 r3Var8 = (com.google.protobuf.r3) n17.l().get(7);
        f250209o = r3Var8;
        f250210p = new com.google.protobuf.j6(r3Var8, new java.lang.String[]{"Resources"});
        com.google.protobuf.r3 r3Var9 = (com.google.protobuf.r3) n17.l().get(8);
        com.google.protobuf.v5[] v5VarArr = new com.google.protobuf.v5[r3Var9.n().size()];
        com.google.protobuf.x5[] x5VarArr = new com.google.protobuf.x5[r3Var9.p().size()];
        com.google.protobuf.r3 r3Var10 = (com.google.protobuf.r3) n17.l().get(9);
        f250211q = r3Var10;
        f250212r = new com.google.protobuf.j6(r3Var10, new java.lang.String[]{"RespList"});
        com.google.protobuf.r3 r3Var11 = (com.google.protobuf.r3) r3Var10.o().get(0);
        f250213s = r3Var11;
        f250214t = new com.google.protobuf.j6(r3Var11, new java.lang.String[]{"ProjectId", "Ret", "Resp"});
        com.google.protobuf.r3 r3Var12 = (com.google.protobuf.r3) n17.l().get(10);
        f250215u = r3Var12;
        f250216v = new com.google.protobuf.j6(r3Var12, new java.lang.String[]{"Content", "SubType"});
        com.google.protobuf.r3 r3Var13 = (com.google.protobuf.r3) n17.l().get(11);
        f250217w = r3Var13;
        f250218x = new com.google.protobuf.j6(r3Var13, new java.lang.String[]{"ResourceName", "ResourceVersion"});
        com.google.protobuf.r3 r3Var14 = (com.google.protobuf.r3) n17.l().get(12);
        f250219y = r3Var14;
        f250220z = new com.google.protobuf.j6(r3Var14, new java.lang.String[]{"ProjectId", "ResourceUpdateList"});
    }
}
